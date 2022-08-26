package dev.cross.model;

public class Account {

	int uID;
	String username;
	String password;
	String firstName;
	String lastName;
	String blurb;
	String image;
	boolean looking;
	boolean setup;
	boolean banned;
	double active;
	double methodical;
	double extrovert;
	double experimental;
	double traditional;
	int hobby1;
	int hobby2;
	int hobby3;
	int hobby4;
	int hobby5;
	
	
	public Account(int uID, String firstName, String lastName, String blurb,
			String image, boolean looking, boolean setup, boolean banned, double active, double methodical,
			double extrovert, double experimental, double traditional, int hobby1, int hobby2, int hobby3, int hobby4,
			int hobby5) {
		this.uID = uID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.blurb = blurb;
		this.image = image;
		this.looking = looking;
		this.setup = setup;
		this.banned = banned;
		this.active = active;
		this.methodical = methodical;
		this.extrovert = extrovert;
		this.experimental = experimental;
		this.traditional = traditional;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
		this.hobby4 = hobby4;
		this.hobby5 = hobby5;
	}
	
	
}
