package com.example.pogo;

public class Address {

	private int id;
	private String village;
	private String mandal;
	private String dist;
	private String state;

	Address(){
		
	}
	
	
	public Address(int id, String village, String mandal, String dist, String state) {
		super();
		this.id = id;
		this.village = village;
		this.mandal = mandal;
		this.dist = dist;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
