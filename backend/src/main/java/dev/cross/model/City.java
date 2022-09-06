package dev.cross.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	int id;
	
	@Column(name="cityname")
	String city;
	
	@Column(name="state")
	String state;

	public City(int id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	
	public City() {
		super();
		this.id = -1;
		this.city = null;
		this.state = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
