package com.bilgeadam.recepergan.app.dao;

import java.time.LocalDate;

import com.bilgeadam.recepergan.app.dto.EGender;
import com.bilgeadam.recepergan.app.dto.EMarried;
import com.bilgeadam.recepergan.app.dto.Name;
import com.bilgeadam.recepergan.app.dto.Student;
import com.bilgeadam.recepergan.app.util.ExceptionMustNotMarried;

public class CreateStudent {
	
	public static void addStudent() throws ExceptionMustNotMarried {
		
		// Student student = new Student(new Name("recep", "", "ergasn"), EGender.MALE,
		// EMarried.SINGLE,
		// LocalDate.of(1993, 11, 3), new String[] { "", "" }, LocalDate.of(1993, 11,
		// 3),
		// LocalDate.of(1993, 11, 3));
		//
		// System.out.println(student);
		Student student = new Student();
		Name name = new Name("recep", "", "ergan");
		System.out.println("-----------------------------------------------------");
		student.setName(name);
		
		student.setGender(EGender.MALE);
		
		student.setMarried(EMarried.SINGLE);
		student.setDateOfBirth(LocalDate.of(1993, 11, 3));
		student.setStartDate(LocalDate.of(2015, 3, 07));
		student.setEndDate(LocalDate.of(2020, 01, 01));
		String[] telephoneNumber = new String[] { "1234", "5678" };
		student.setTelephoneNumber(telephoneNumber);
		System.out.printf("\t%-15s: %s%n", "Name", student.getName());
		System.out.printf("\t%-15s: %s%n", "Evlilik Durumu", student.getMarried());
		System.out.printf("\t%-15s: %s%n", "Cinsiyeti", student.getGender());
		System.out.printf("\t%-15s: %s\n", "Doğum Tarihi", student.getDateOfBirth());
		System.out.printf("\t%-15s: %s%n", "başlama günü", student.getStartDate());
		// System.out.println(String.format("\tbaşlama günü :%s%n",
		// student.getStartDate()));
		System.out.printf("\t%-15s: %s%n", "son günü", student.getEndDate());
		for (int i = 0; i < student.getTelephoneNumber().length; i++) {
			System.out.printf("\t%-15s: %s%n", "telefon no", student.getTelephoneNumber()[i]);
		}
		// Arrays.toString(getTelephoneNumber());
	}
	
	// this.studentNumber = String.format("%d-%03d", year.getYear(), count);
}
