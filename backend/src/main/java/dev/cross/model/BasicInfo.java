package dev.cross.model;

public class BasicInfo {

	private int uid;
	private String fName;
	private String lName;
	private int city;
	private boolean m;
	private boolean lfm;
	private boolean lff;
	
	
	public BasicInfo(int uid, String fName, String lName, int city, boolean m, boolean lfm, boolean lff) {
		super();
		this.uid = uid;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.m = m;
		this.lfm = lfm;
		this.lff = lff;
	}


	public int getUid() {
		return uid;
	}


	public String getfName() {
		return fName;
	}


	public String getlName() {
		return lName;
	}


	public int getCity() {
		return city;
	}


	public boolean isM() {
		return m;
	}


	public boolean isLfm() {
		return lfm;
	}


	public boolean isLff() {
		return lff;
	}
	
	
	
}
