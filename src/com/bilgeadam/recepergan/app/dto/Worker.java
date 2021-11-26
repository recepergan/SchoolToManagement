package com.bilgeadam.recepergan.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public abstract class Worker extends Person implements Serializable {
	
	private static final long serialVersionUID = 2752926002021558889L;
	
	private double startSalary;
	
	public Worker() {
		
	}
	
	public Worker(Name name, EGender gender, EMarried married, LocalDate dateOfBirth, String[] telephoneNumber,
			LocalDate startDate, LocalDate endDate, double startSalary) {
		super(name, gender, married, dateOfBirth, telephoneNumber, startDate, endDate);
		this.startSalary = startSalary;
	}
	
	@Override
	public String toString() {
		return "Worker [startSalary=" + startSalary + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", getMarried()=" + getMarried() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getTelephoneNumber()=" + Arrays.toString(getTelephoneNumber()) + ", getStartDate()="
				+ getStartDate() + ", getEndDate()=" + getEndDate() + "]";
	}
	
	public double getStartSalary() {
		return startSalary;
	}
	
	public void setStartSalary(double startSalary) {
		this.startSalary = startSalary;
	}
	
}
