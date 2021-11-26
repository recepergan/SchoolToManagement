package com.bilgeadam.recepergan.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Officer extends Worker implements Serializable {
	
	private static int count;
	
	private static final long serialVersionUID = 7216963433537950560L;
	
	private String registrationNumber;
	
	public Officer() {
		createRegistrationNumber();
	}
	
	private void createRegistrationNumber() {
		if (count >= 0 & count < 1000) {
			count++;
			this.registrationNumber = String.format("O-%03d", count);
			
		}
		
	}
	
	public Officer(Name name, EGender gender, EMarried married, LocalDate dateOfBirth, String[] telephoneNumber,
			LocalDate startDate, LocalDate endDate, double startSalary) {
		super(name, gender, married, dateOfBirth, telephoneNumber, startDate, endDate, startSalary);
		createRegistrationNumber();
	}
	
	@Override
	public String toString() {
		return "Officer [registrationNumber=" + registrationNumber + ", getStartSalary()=" + getStartSalary()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getMarried()=" + getMarried()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getTelephoneNumber()="
				+ Arrays.toString(getTelephoneNumber()) + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + "]";
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
		
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Officer.count = count;
	}
	
}
