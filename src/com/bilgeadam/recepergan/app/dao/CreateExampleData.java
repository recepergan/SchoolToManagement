package com.bilgeadam.recepergan.app.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import com.bilgeadam.recepergan.app.dto.EGender;
import com.bilgeadam.recepergan.app.dto.EMarried;
import com.bilgeadam.recepergan.app.dto.Lesson;
import com.bilgeadam.recepergan.app.dto.Name;
import com.bilgeadam.recepergan.app.dto.Officer;
import com.bilgeadam.recepergan.app.dto.Person;
import com.bilgeadam.recepergan.app.dto.Servant;
import com.bilgeadam.recepergan.app.dto.Student;
import com.bilgeadam.recepergan.app.dto.Teacher;
import com.bilgeadam.recepergan.app.util.ExceptionMustNotMarried;

// public Lesson(Teacher primaryTeacher, Teacher secondaryTeacher, String
// lessonName, String period,
// ArrayList<Student> listStudent, int totalHourLesson, String dayOfWeekLesson,
// String startHoursLesson) {
// super();
// this.primaryTeacher = primaryTeacher;
// this.secondaryTeacher = secondaryTeacher;
// this.lessonName = lessonName;
// this.period = period;
// this.listStudent = listStudent;
// this.totalHourLesson = totalHourLesson;
// this.dayOfWeekLesson = dayOfWeekLesson;
// this.startHoursLesson = startHoursLesson;
// }
public class CreateExampleData {
	
	private ArrayList<Person> allworkers = new ArrayList<Person>();
	private ArrayList<Lesson> allLesson = new ArrayList<Lesson>();
	
	private static CreateExampleData instance;
	
	private CreateExampleData() {
		
	}
	
	public static CreateExampleData getInstance() {
		if (instance == null) {
			instance = new CreateExampleData();
		}
		return instance;
	}
	
	public void addLesson(Lesson lesson) {
		
		allLesson.add(lesson);
	}
	
	public void create() throws ExceptionMustNotMarried {
		Student student1 = new Student(new Name("recep", "", "ergasn"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1993, 11, 3), new String[] { "23", "34567" }, LocalDate.of(1993, 11, 3), null);
		Student student2 = new Student(new Name("kamil", "", "vnsdv"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1993, 11, 3), new String[] { "3456", "345678" }, LocalDate.of(1993, 11, 3), null);
		ArrayList<Student> listStudent = new ArrayList<Student>();
		listStudent.add(student1);
		listStudent.add(student2);
		
		Teacher teacher1 = new Teacher(new Name("ali", " ", "ergul"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1987, 01, 21), new String[] { "1234", "5678" }, LocalDate.of(2019, 01, 21), null, 10.000);
		Teacher teacher2 = new Teacher(new Name("kazım", " ", "nelazım"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1987, 01, 21), new String[] { "1234", "5678" }, LocalDate.of(2010, 01, 21), null, 10.000);
		Teacher teacher3 = new Teacher(new Name("mali", " ", "kali"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1987, 01, 21), new String[] { "1234", "5678" }, LocalDate.of(2010, 01, 01),
				LocalDate.of(2015, 10, 1), 10.000);
		Servant servant = new Servant(new Name("servant1", " ", "serbavauısw"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1987, 01, 21), new String[] { "1234", "5678" }, LocalDate.of(2010, 01, 21), null, 10.000);
		Officer officer = new Officer(new Name("officer", " ", "asdcv"), EGender.MALE, EMarried.SINGLE,
				LocalDate.of(1987, 01, 21), new String[] { "1234", "5678" }, LocalDate.of(2010, 01, 21), null, 10.000);
		Lesson lesson = new Lesson(teacher1, teacher2, "Matamatik", "2020- 1.Dönem", listStudent, 100, "3", "9:00");
		Lesson lesson2 = new Lesson(teacher1, teacher2, "Fizik", "2020- 1.Dönem", listStudent, 100, "3", "9:00");
		
		allLesson.add(lesson);
		allLesson.add(lesson2);
		allworkers.add(student1);
		allworkers.add(student2);
		allworkers.add(teacher1);
		allworkers.add(teacher2);
		allworkers.add(teacher3);
		allworkers.add(servant);
		allworkers.add(officer);
		
	}
	
	public ArrayList<Person> getAllworkers() {
		return allworkers;
	}
	
	public ArrayList<Lesson> getAllLesson() {
		return allLesson;
	}
	
}
