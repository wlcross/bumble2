package dev.cross.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.cross.model.City;

@Repository
public interface CityDAO extends JpaRepository<City, Integer> {

	//Get Citites
	@Query(value="select * from bumble2.city where "
			+ "state = :s "
			+ "order by cityname", nativeQuery = true)
	public List<City> getCities(String s);
	
	
	//Get States
	@Query(value="select distinct state from bumble2.city "
			+ "where state is not null "
			+ "order by state", nativeQuery = true)
	public List<String> getStates();
}
