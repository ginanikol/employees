package gina.nikol.qnr.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gina.nikol.qnr.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Employee> getEmployees() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Employee> query = currentSession.createQuery("from Employee ORDER BY lastName", Employee.class);

		List<Employee> employees = query.getResultList();

		return employees;
	}

}
