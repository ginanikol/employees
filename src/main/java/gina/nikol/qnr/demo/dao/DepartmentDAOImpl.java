package gina.nikol.qnr.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gina.nikol.qnr.demo.entity.Department;


@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Department> getDepartments() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Department> query = currentSession.createQuery("from Department ORDER BY departmentName",
				Department.class);

		List<Department> departments = query.getResultList();

		return departments;
	}

	@Override
	@Transactional
	public Department getDepartment(int depId) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createQuery("from Department WHERE id=" + depId, Department.class);

		Department department = query.getSingleResult();

		return department;
	}

}
