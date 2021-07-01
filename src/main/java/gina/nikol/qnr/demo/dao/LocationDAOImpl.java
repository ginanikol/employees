package gina.nikol.qnr.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gina.nikol.qnr.demo.entity.Location;

@Repository
public class LocationDAOImpl implements LocationDAO {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Location> getLocations() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Location> query = currentSession.createQuery("from Location", Location.class);

		List<Location> locations = query.getResultList();

		return locations;
	}

	@Override
	@Transactional
	public Location getLocation(int locId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Location> query = currentSession.createQuery("from Location WHERE id=" + locId, Location.class);

		Location location = query.getSingleResult();

		return location;
	}
}
