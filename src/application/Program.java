package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerdao.findById(3);		
		System.out.println(seller);
		
		System.out.println();

		System.out.println("=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		
		list.stream().forEach(c -> System.out.println(c));
		
		System.out.println();
		
		System.out.println("=== TEST 3: seller findAll =====");
		List<Seller> newList = sellerdao.findAll();
		
		newList.stream().forEach(c -> System.out.println(c));
		
		System.out.println();
		
		System.out.println("=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
	}
}
