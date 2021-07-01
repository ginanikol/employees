package gina.nikol.qnr.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gina.nikol.qnr.demo.dao.EmployeeDAO;
import gina.nikol.qnr.demo.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	// inject the employee dao ref
	@Autowired
	private EmployeeDAO employeeDAO;

	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		List<Employee> theEmployees = employeeDAO.getEmployees();

		theModel.addAttribute("employees", theEmployees);

		return "list-employees";
	}

}
