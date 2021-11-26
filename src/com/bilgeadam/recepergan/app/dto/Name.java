package com.bilgeadam.recepergan.app.dto;

public class Name {
	
	private String firstName;
	private String middleName;
	private String surName;
	
	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	public Name(String firstName, String middleName, String surName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
	}
	
	@Override
	public String toString() {
		String temp = "";
		if (middleName != null || !middleName.trim().isEmpty()) {
			temp = middleName + " ";
		}
		return firstName + " " + temp + surName;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
}
