package com.bilgeadam.recepergan.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import com.bilgeadam.recepergan.app.util.ExceptionMustNotMarried;

public abstract class Person implements Serializable {
	
	private static final long serialVersionUID = -1805448437830515612L;
	
	private Name name;
	private EGender gender;
	private EMarried married;
	private LocalDate dateOfBirth;
	private String[] telephoneNumber;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(Name name, EGender gender, EMarried married, LocalDate dateOfBirth, String[] telephoneNumber,
			LocalDate startDate, LocalDate endDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.married = married;
		this.dateOfBirth = dateOfBirth;
		this.telephoneNumber = telephoneNumber;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", married=" + married + ", dateOfBirth=" + dateOfBirth
				+ ", telephoneNumber=" + Arrays.toString(telephoneNumber) + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public EGender getGender() {
		return gender;
	}
	
	public void setGender(EGender gender) {
		this.gender = gender;
	}
	
	public EMarried getMarried() {
		return married;
	}
	
	public void setMarried(EMarried married) throws ExceptionMustNotMarried {
		this.married = married;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String[] getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String[] telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
