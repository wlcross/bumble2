package dev.cross.model;

public class ListAccount {

	int uid;
	String firstName;
	String lastName;
	int city;
	boolean male;
	String image;
	
	double compatability;
	String youreboth;
	
	
	public ListAccount(int uid, String firstName, String lastName, int city, boolean male, String image,
			double compatability, String youreboth) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.male = male;
		this.image = image;
		this.compatability = compatability;
		this.youreboth = youreboth;
	}
	
	public ListAccount (Account theAccount, Account searcher) {
		this.uid = theAccount.getId();
		this.firstName = theAccount.getFirstName();
		this.lastName = theAccount.getLastName();
		this.city = theAccount.getCity();
		this.male = theAccount.isMale();
		this.image = theAccount.getImage();
		
		this.compatability = 1.0;
		
		//Compatability Algorithm
		//Part 1: Activity
		double compatMod = (theAccount.getActive() - searcher.getActive());
		compatMod /= 2;
		compatMod *= compatMod;
		compatMod /= 5;
		this.compatability -= compatMod;
		//Part 2: Methodical
		compatMod = (theAccount.getMethodical() - searcher.getMethodical());
		compatMod /= 2;
		compatMod *= compatMod;
		compatMod /= 5;
		this.compatability -= compatMod;
		//Part 3: Extrovert
		compatMod = (theAccount.getExtrovert() - searcher.getExtrovert());
		compatMod /= 2;
		compatMod *= compatMod;
		compatMod /= 5;
		this.compatability -= compatMod;
		//Part 4: Experimental
		compatMod = (theAccount.getExperimental() - searcher.getExperimental());
		compatMod /= 2;
		compatMod *= compatMod;
		compatMod /= 5;
		this.compatability -= compatMod;
		//Part 5: Tradition
		compatMod = (theAccount.getTraditional() - searcher.getTraditional());
		compatMod /= 2;
		compatMod *= compatMod;
		compatMod /= 5;
		this.compatability -= compatMod;
		//Part 6: Hobbies
		boolean bothSet = false;
		if (theAccount.getHobby1() != 0) {
			if (theAccount.getHobby1() == searcher.getHobby1()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby1() == searcher.getHobby2()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby1() == searcher.getHobby3()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby1() == searcher.getHobby4()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby1() == searcher.getHobby5()) {
				this.compatability += .1;
			}
		}
		if (theAccount.getHobby2() != 0) {
			if (theAccount.getHobby2() == searcher.getHobby1()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby2() == searcher.getHobby2()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby2() == searcher.getHobby3()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby2() == searcher.getHobby4()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby2() == searcher.getHobby5()) {
				this.compatability += .1;
			}
		}
		if (theAccount.getHobby3() != 0) {
			if (theAccount.getHobby3() == searcher.getHobby1()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby3() == searcher.getHobby2()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby3() == searcher.getHobby3()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby3() == searcher.getHobby4()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby3() == searcher.getHobby5()) {
				this.compatability += .1;
			}
		}
		if (theAccount.getHobby4() != 0) {
			if (theAccount.getHobby4() == searcher.getHobby1()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby4() == searcher.getHobby2()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby4() == searcher.getHobby3()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby4() == searcher.getHobby4()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby4() == searcher.getHobby5()) {
				this.compatability += .1;
			}
		}
		if (theAccount.getHobby5() != 0) {
			if (theAccount.getHobby5() == searcher.getHobby1()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby5() == searcher.getHobby2()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby5() == searcher.getHobby3()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby5() == searcher.getHobby4()) {
				this.compatability += .1;
			}
			if (theAccount.getHobby5() == searcher.getHobby5()) {
				this.compatability += .1;
			}
		}
		if (this.compatability > 1.0) this.compatability = 1.0;
	}
	
	public double getCompatability() {
		return this.compatability;
	}
	
	public String getYoureBoth() {
		return this.youreboth;
	}
	
}
