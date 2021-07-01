package gina.nikol.qnr.demo.dao;

import java.util.List;

import gina.nikol.qnr.demo.entity.Department;

public interface DepartmentDAO {

	public List<Department> getDepartments();
	
	public Department getDepartment(int depId);
	
}
