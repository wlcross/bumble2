package dev.cross.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.cross.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

	@Query(value="select user_id from bumble2.account where "
			+ "username = :u and "
			+ "pass = :p", nativeQuery = true)
	public Integer login(String u, String p);
	
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
	
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set attractedtomales = :lfm, "
			+ "attractedtofemales = :lff "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifySexuality(int uid, boolean lfm, boolean lff);
	
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set fname = :fName "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyFirstName(int uid, String fName);
	
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set lname = :lName "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyLastName(int uid, String lName);
	
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set city = :city "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyCity(int uid, int city);
	
	@Modifying
	@Transactional
	@Query(value="update bumble2.account "
			+ "set male = :male "
			+ "where user_id = :uid", 
			nativeQuery = true)
	public void modifyGender(int uid, boolean male);
	
}
