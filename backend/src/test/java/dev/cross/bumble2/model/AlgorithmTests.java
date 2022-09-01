package dev.cross.bumble2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dev.cross.model.Account;
import dev.cross.model.ListAccount;

class AlgorithmTests {

	@Test
	void sanityTest() {
		assertEquals(1, 1);
	}
	
	@Test
	void perfectMatch() {
		Account foo = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 0, 0, 0, 0, 0);
		Account bar = new Account(2, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 0, 0, 0, 0, 0);
		
		ListAccount fooList = new ListAccount(foo, bar);
		
		assertEquals(fooList.getCompatability(), 1.0, 0.0001);
	}
	
	@Test
	void notQuitePerfect() {
		Account foo = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 0, 0, 0, 0, 0);
		Account bar = new Account(2, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.4, 0.5, 0.5, 0.5,
				0.5, 0, 0, 0, 0, 0);
		
		ListAccount fooList = new ListAccount(foo, bar);
		
		assertNotEquals(fooList.getCompatability(), 1.0, 0.0001);
	}
	
	@Test
	void noRedeemingQualities() {
		Account foo = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 1, 1, 1, 1, 1, 
				0, 0, 0, 0, 0);
		Account bar = new Account(2, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0);
		
		ListAccount fooList = new ListAccount(foo, bar);
		
		assertEquals(fooList.getCompatability(), 0, 0.0001);
	}
	
	@Test
	void atLeastHeHasHobbies() {
		Account foo = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0, -0.5, -0.5, 0.5,
				0.5, 1, 0, 0, 0, 0);
		Account fu = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0, -0.5, -0.5, 0.5,
				0.5, 0, 0, 0, 0, 0);
		Account bar = new Account(2, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 1, 0, 0, 0, 0);
		
		ListAccount fooList = new ListAccount(foo, bar);
		ListAccount fuList = new ListAccount(fu, bar);
		
		assertEquals(fooList.getCompatability(), fuList.getCompatability() + 0.1, 0.0001);
	}
	
	@Test
	void tooPerfect() {
		Account foo = new Account(1, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 1, 0, 0, 0, 0);
		Account bar = new Account(2, null, null, null, null, 0, null,
				null, true, true, true, true,
				false, false, 0.5, 0.5, 0.5, 0.5,
				0.5, 1, 0, 0, 0, 0);
		
		ListAccount fooList = new ListAccount(foo, bar);
		
		assertEquals(fooList.getCompatability(), 1.0, 0.0001);
	}

}
