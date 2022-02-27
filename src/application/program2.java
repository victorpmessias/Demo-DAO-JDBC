package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== TEST 1: department insert =====");
//		Department dep = new Department();
//		dep.setName("Food");
//		depDao.insert(dep);
//		System.out.println("Insert Complet! New Id inserted: " + dep.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 2: department update =====");
		Department upDep = new Department();
		upDep.setId(3);
		upDep.setName("Jeans");
		depDao.update(upDep);
		System.out.println("Update completed");
		
		System.out.println();
		
		System.out.println("=== TEST 3: department findById =====");
		Department findDep = depDao.findById(4);
		System.out.println(findDep);
		
		System.out.println();
		
		System.out.println("=== TEST 4: department findALl =====");
		List<Department> depList = depDao.findAll();
		depList.stream().forEach(dep -> System.out.println(dep));
		
		System.out.println();
		
	}

}
