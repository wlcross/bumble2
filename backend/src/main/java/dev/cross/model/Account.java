package dev.cross.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	int uID;
	
	@Column(name="username")
	String username;
	
	@Column(name="pass")
	String password;
	
	@Column(name="fname")
	String firstName;
	
	@Column(name="lname")
	String lastName;
	
	@Column(name="city")
	int city;
	
	@Column(name="blurb")
	String blurb;
	
	@Column(name="image")
	String image;
	
	@Column(name="male")
	boolean male;
	
	@Column(name="attractedtomales")
	boolean attractedtomales;
	
	@Column(name="attractedtofemales")
	boolean attractedtofemales;
	
	@Column(name="looking")
	boolean looking;
	
	@Column(name="setup")
	boolean setup;
	
	@Column(name="banned")
	boolean banned;
	
	@Column(name="active")
	double active;
	
	@Column(name="methodical")
	double methodical;
	
	@Column(name="extrovert")
	double extrovert;
	
	@Column(name="experimental")
	double experimental;
	
	@Column(name="traditional")
	double traditional;
	
	@Column(name="hobby1")
	int hobby1;
	
	@Column(name="hobby2")
	int hobby2;
	
	@Column(name="hobby3")
	int hobby3;
	
	@Column(name="hobby4")
	int hobby4;

	@Column(name="hobby5")
	int hobby5;
	
	public Account(int uID, String username, String password, String firstName, String lastName, int city, String blurb,
			String image, boolean male, boolean attractedtomales, boolean attractedtofemales, boolean looking,
			boolean setup, boolean banned, double active, double methodical, double extrovert, double experimental,
			double traditional, int hobby1, int hobby2, int hobby3, int hobby4, int hobby5) {
		super();
		this.uID = uID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.blurb = blurb;
		this.image = image;
		this.male = male;
		this.attractedtomales = attractedtomales;
		this.attractedtofemales = attractedtofemales;
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
	
	public int getId() {
		return uID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String p) {
		this.password = p;
	}

	public int getuID() {
		return uID;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getCity() {
		return city;
	}

	public String getBlurb() {
		return blurb;
	}

	public String getImage() {
		return image;
	}

	public boolean isMale() {
		return male;
	}

	public boolean isAttractedtomales() {
		return attractedtomales;
	}

	public boolean isAttractedtofemales() {
		return attractedtofemales;
	}

	public boolean isLooking() {
		return looking;
	}

	public boolean isSetup() {
		return setup;
	}

	public boolean isBanned() {
		return banned;
	}

	public double getActive() {
		return active;
	}

	public double getMethodical() {
		return methodical;
	}

	public double getExtrovert() {
		return extrovert;
	}

	public double getExperimental() {
		return experimental;
	}

	public double getTraditional() {
		return traditional;
	}

	public int getHobby1() {
		return hobby1;
	}

	public int getHobby2() {
		return hobby2;
	}

	public int getHobby3() {
		return hobby3;
	}

	public int getHobby4() {
		return hobby4;
	}

	public int getHobby5() {
		return hobby5;
	}

	//TODO DELETE
	@Override
	public String toString() {
		return "Account [uID=" + uID + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", city=" + city + ", blurb=" + blurb + ", image=" + image + ", male="
				+ male + ", attractedtomales=" + attractedtomales + ", attractedtofemales=" + attractedtofemales
				+ ", looking=" + looking + ", setup=" + setup + ", banned=" + banned + ", active=" + active
				+ ", methodical=" + methodical + ", extrovert=" + extrovert + ", experimental=" + experimental
				+ ", traditional=" + traditional + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3
				+ ", hobby4=" + hobby4 + ", hobby5=" + hobby5 + "]";
	}
	
	
}
