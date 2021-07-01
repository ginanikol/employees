package gina.nikol.qnr.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gina.nikol.qnr.demo.dao.LocationDAO;
import gina.nikol.qnr.demo.entity.Location;

import gina.nikol.qnr.demo.entity.Department;

@Controller
@RequestMapping("/location")
public class LocationController {

	// inject the loc dao
	@Autowired
	private LocationDAO locationDAO;
	

	@GetMapping("/list")
	public String listLocations(Model theModel) {
		
		List<Location> location = locationDAO.getLocations();
				
		theModel.addAttribute("locations", location);
		
		return "list-locations";
	}
	
	
	@Autowired
	private LocationDAO locationDAO2;
	@RequestMapping("/processForm")
	public String listDepsFromLocation(@RequestParam(name = "locId") String locId, Model theModel) {
	
		int theLocId = Integer.parseInt(locId);
		
		Location theLocation = locationDAO2.getLocation(theLocId);

		List<Department> theDepartments = theLocation.getDepartments();
	
		theModel.addAttribute("theDepartments", theDepartments);
		theModel.addAttribute("locName", theLocation.getLocation());
		
		return "departments-at-location";
	}
}


