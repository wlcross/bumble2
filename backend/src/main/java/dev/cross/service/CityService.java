package dev.cross.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.cross.repository.CityDAO;
import dev.cross.model.City;

@Service
public class CityService {

	private final CityDAO cityDao;
	
	@Autowired
	public CityService(CityDAO cityDao) {
		this.cityDao = cityDao;
	}
	
	public List<City> getCities(String s) {
		return cityDao.getCities(s);
	}
	
	public List<String> getStates() {
		return cityDao.getStates();
	}
}
