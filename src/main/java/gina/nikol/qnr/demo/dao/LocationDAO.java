package gina.nikol.qnr.demo.dao;

import java.util.List;

import gina.nikol.qnr.demo.entity.Location;

public interface LocationDAO {

	public List<Location> getLocations();

	public Location getLocation(int locId);

}
