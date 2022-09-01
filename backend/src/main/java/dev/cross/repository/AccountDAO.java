package dev.cross.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.cross.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

	//Login
	@Query(value="select user_id from bumble2.account where "
			+ "username = :u and "
			+ "pass = :p", nativeQuery = true)
	public Integer login(String u, String p);
	
	//Basic Account Info
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set fname = :fName, "
			+ "lname = :lName, "
			+ "male = :m, "
			+ "city = :c, "
			+ "attractedtomales = :lfm, "
			+ "attractedtofemales = :lff "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void basicAccountInfoSetup(int uid, String fName, String lName, int c, boolean m, boolean lfm, boolean lff);
	
	//Modify Sexuality
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set attractedtomales = :lfm, "
			+ "attractedtofemales = :lff "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifySexuality(int uid, boolean lfm, boolean lff);
	
	//Modify First Name
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set fname = :fName "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyFirstName(int uid, String fName);
	
	//Modify Last Name
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set lname = :lName "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyLastName(int uid, String lName);
	
	//Modify City
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set city = :city "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyCity(int uid, int city);
	
	//Modify Gender
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set male = :male "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyGender(int uid, boolean male);
	
	//get by ID (built in
	//Account getById(int i);
	
	//Get List of Men for men
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtomales = true;", nativeQuery = true)
	public Integer getMenForMen(int city);
	
	//Get List of Women for men
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtomales = true;", nativeQuery = true)
	public Integer getWomenForMen(int city);
	
	//Get List of both for men
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtomales = true;", nativeQuery = true)
	public Integer getAllForMen(int city);
	
	//Get List of Men for women
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtofemales = true;", nativeQuery = true)
	public Integer getMenForWomen(int city);
	
	//Get List of Women for women
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtofemales = true;", nativeQuery = true)
	public Integer getWomenForWomen(int city);
	
	//Get List of both for women
	@Query(value="select * from bumble2.account where "
			+ "city = :city and "
			+ "male = true and "
			+ "attractedtofemales = true;", nativeQuery = true)
	public Integer getAllForWomen(int city);
	
}
