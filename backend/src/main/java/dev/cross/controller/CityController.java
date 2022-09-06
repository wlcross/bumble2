package dev.cross.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.cross.model.City;
import dev.cross.service.CityService;

@CrossOrigin
@RestController
public class CityController {

	private final CityService cityService;
	
	@Autowired
	public CityController (CityService cityService) {
		this.cityService = cityService;
	}
	
	@RequestMapping(value = "/cities/{state}")
	public ResponseEntity<List<City>> getCities(@PathVariable("state") String state) {
		List<City> cityList = cityService.getCities(state);
		
		if (cityList.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(cityList);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(cityList);
		}
	}
	
	@RequestMapping(value = "/states")
	public ResponseEntity<List<String>> getStates() {
		List<String> stateList = cityService.getStates();
		
		if (stateList.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(stateList);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(stateList);
		}
	}
}
