package com.bilgeadam.recepergan.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import com.bilgeadam.recepergan.app.util.ExceptionMustNotMarried;

public class Student extends Person implements Serializable {
	
	private static int count = 0;
	
	private static final long serialVersionUID = 3466035891973836513L;
	
	@Override
	public void setMarried(EMarried married) throws ExceptionMustNotMarried {
		if (married == EMarried.MARRIED) {
			throw new ExceptionMustNotMarried("Öğrenciler Evli Olamaz");
		} else {
			super.setMarried(married);
		}
	}
	
	private String studentNumber;
	private int sizeClass;
	
	public Student() {
		createstudentNumber();
	}
	
	public Student(Name name, EGender gender, EMarried married, LocalDate dateOfBirth, String[] telephoneNumber,
			LocalDate startDate, LocalDate endDate) throws ExceptionMustNotMarried {
		super(name, gender, married, dateOfBirth, telephoneNumber, startDate, endDate);
		createstudentNumber();
		marriedControl(married);
	}
	
	private void marriedControl(EMarried married) throws ExceptionMustNotMarried {
		if (married == EMarried.MARRIED) {
			throw new ExceptionMustNotMarried("Öğrenciler Evli Olamaz");
		}
	}
	
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", sizeClass=" + sizeClass + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getMarried()=" + getMarried() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getTelephoneNumber()=" + Arrays.toString(getTelephoneNumber())
				+ ", getStartDate()=" + getStartDate() + ", getEndDate()=" + getEndDate() + "]";
	}
	
	private void createstudentNumber() {
		
		if (count >= 0 & count < 1000) {
			LocalDate year = LocalDate.now();
			
			count++;
			this.studentNumber = String.format("%d-%03d", year.getYear(), count);
			
		}
		
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public int getSizeClass() {
		return sizeClass;
	}
	
}
