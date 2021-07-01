package gina.nikol.qnr.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gina.nikol.qnr.demo.dao.DepartmentDAO;
import gina.nikol.qnr.demo.entity.Department;
import gina.nikol.qnr.demo.entity.Employee;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	// inject the department dao

	@Autowired
	private DepartmentDAO departmentDAO;

	@GetMapping("/list")
	public String listDepartments(Model theModel) {

		List<Department> theDepartments = departmentDAO.getDepartments();

		theModel.addAttribute("departments", theDepartments);

		return "list-departments";
	}

	@Autowired
	private DepartmentDAO departmentDAO2;

	@GetMapping("/processForm")
	public String listEmployees(@RequestParam(name = "depId") String depId, Model theModel) {

		int departmentId = Integer.parseInt(depId);
		Department department = departmentDAO2.getDepartment(departmentId);
		String depName = department.getDepartmentName();

		List<Employee> theEmployeesInDep = department.getEmployees();

		theModel.addAttribute("theEmployeesInDep", theEmployeesInDep);
		theModel.addAttribute("depName", depName);

		return "employees-at-department";
	}

}
