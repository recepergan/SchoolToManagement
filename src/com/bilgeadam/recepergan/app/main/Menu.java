package com.bilgeadam.recepergan.app.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.bilgeadam.recepergan.app.dao.CreateExampleData;
import com.bilgeadam.recepergan.app.dto.Lesson;
import com.bilgeadam.recepergan.app.dto.Person;
import com.bilgeadam.recepergan.app.dto.Student;
import com.bilgeadam.recepergan.app.dto.Teacher;
import com.bilgeadam.recepergan.app.util.ExceptionMustNotMarried;

// t(Name name, EGender gender, EMarried married, LocalDate dateOfBirth,
// String[] telephoneNumber,
// LocalDate startDate, LocalDate endDate) {
// super(name, gender, married, dateOfBirth, telephoneNumber, startDate,
// endDate);
// createstudentNumber();

public class Menu {
	private static Scanner klavye = new Scanner(System.in);
	
	public static void main(String[] args) throws ExceptionMustNotMarried {
		
		int value = -1;
		
		while ((value = menu()) != 0) {
			switch (value) {
				case 1:
					CreateExampleData.getInstance().create();
					break;
				case 2:
					for (Person worker : CreateExampleData.getInstance().getAllworkers()) {
						if (worker.getEndDate() == null) {
							System.out.println(worker);
						}
					}
					break;
				case 3:
					for (Person worker : CreateExampleData.getInstance().getAllworkers()) {
						if (worker.getEndDate() != null) {
							LocalDate start = worker.getStartDate();
							LocalDate finish = worker.getEndDate();
							int years = (int) start.until(finish, ChronoUnit.YEARS);
							int month = (int) start.until(finish, ChronoUnit.MONTHS);
							System.out.println(worker.getName() + " " + start + " " + finish + " " + years + " yıl "
									+ month % 12 + " ay ");
						}
					}
					break;
				case 4:
					System.out.print("Lütfen ders giriniz");
					klavye.nextLine();
					String lessonName = klavye.nextLine();
					
					Teacher teacher = searchTeacher();
					if (teacher == null) {
						break;
					}
					Teacher teacherSecondary = searchTeacher();
					if (teacher == null) {
						break;
					}
					Lesson lesson = new Lesson(teacher, teacherSecondary, lessonName, lessonName, null, value,
							lessonName, lessonName);
					
					CreateExampleData.getInstance().addLesson(lesson);
					
					break;
				case 5:
					addStudent();
					
					// 1- AllLesson listesinde Dersi bul
					// 2- AllWorker listesinde öğrenci bul
					// 3- Öğrenciyi allLessonda bulmuş olduğun Lesson a add metoduyla ekle
					// 4- Adım 2 i tekrar cağır(Adım 1 ile 2 arasına while koy)
					// 5- sıfıra basılınca cıksın
					
					break;
				default:
					break;
			}
		}
		
	}
	
	private static void addStudent() {
		String number = "";
		
		for (Lesson temp : CreateExampleData.getInstance().getAllLesson()) {
			System.out.println("lütfend ders ismi giriniz");
			klavye.nextLine();
			String lessonName = klavye.nextLine();
			if (temp.getLessonName() == lessonName) {
				while (!number.equals("0")) {
					for (Person temp1 : CreateExampleData.getInstance().getAllworkers()) {
						if (temp1 instanceof Student) {
							temp.addLesson((Student) temp1);
							System.out
									.println(temp.getLessonName() + "derse" + temp1.getName() + "adlı öğrenci eklendi");
							
						}
						
					}
				}
				
			}
		}
		
	}
	
	private static Teacher searchTeacher() {
		String number = "";
		while (!number.equals("0")) {
			System.out.println("Lütfen öğretmen sicil giriniz");
			number = klavye.nextLine();
			for (Person temp : CreateExampleData.getInstance().getAllworkers()) {
				if (temp instanceof Teacher) {
					Teacher tempT = (Teacher) temp;
					if (tempT.getRegistrationNumber().contains(number)) {
						System.out.println(tempT.getName() + " eklendi");
						return tempT;
					}
					
				}
			}
			System.out.println("Öğretmen bulunamadı");
		}
		return null;
		
	}
	
	public static int menu() {
		
		System.out.println("(1) .....Yeni Çalışan\n(2) .....Çalışan Listesi\n"
				+ "(3) .....Eski Çalışanlar\n(4) .....Yeni Sınıf\n(5) .....Öğrenci Atama\n"
				+ "(6) .....Sınıf Listesi\n(7) .....Öğrencinin Sınıflar\n"
				+ "(8) .....Hediye Listesi\n(9) .....Maaş Listesi\n" + "(10) ....Uygulamadan Çıkış\n\n"
				+ "Lütfen Seçiminizi Yapınız : ");
		int value = klavye.nextInt();
		return value;
		
	}
}
