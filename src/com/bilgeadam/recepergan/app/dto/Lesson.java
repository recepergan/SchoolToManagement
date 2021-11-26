package com.bilgeadam.recepergan.app.dto;

import java.util.ArrayList;

public class Lesson {
	private Teacher primaryTeacher;
	private Teacher secondaryTeacher;
	private String lessonName;
	private String period;
	private int totalHourLesson;
	private String dayOfWeekLesson;
	private String startHoursLesson;
	ArrayList<Student> listStudent = new ArrayList<Student>();
	
	public Lesson() {
		// TODO Auto-generated constructor stub
	}
	
	public Lesson(Teacher primaryTeacher, Teacher secondaryTeacher, String lessonName, String period,
			ArrayList<Student> listStudent, int totalHourLesson, String dayOfWeekLesson, String startHoursLesson) {
		super();
		this.primaryTeacher = primaryTeacher;
		this.secondaryTeacher = secondaryTeacher;
		this.lessonName = lessonName;
		this.period = period;
		this.listStudent = listStudent;
		this.totalHourLesson = totalHourLesson;
		this.dayOfWeekLesson = dayOfWeekLesson;
		this.startHoursLesson = startHoursLesson;
	}
	
	@Override
	public String toString() {
		return "Lesson [primaryTeacher=" + primaryTeacher + ", secondaryTeacher=" + secondaryTeacher + ", lessonName="
				+ lessonName + ", period=" + period + ", listStudent=" + listStudent + ", totalHourLesson="
				+ totalHourLesson + ", dayOfWeekLesson=" + dayOfWeekLesson + ", startHoursLesson=" + startHoursLesson
				+ "]";
	}
	
	public void addLesson(Student student) {
		
		listStudent.add(student);
	}
	
	public Teacher getPrimaryTeacher() {
		return primaryTeacher;
	}
	
	public void setPrimaryTeacher(Teacher primaryTeacher) {
		this.primaryTeacher = primaryTeacher;
	}
	
	public Teacher getSecondaryTeacher() {
		return secondaryTeacher;
	}
	
	public void setSecondaryTeacher(Teacher secondaryTeacher) {
		this.secondaryTeacher = secondaryTeacher;
	}
	
	public String getLessonName() {
		return lessonName;
	}
	
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	
	public String getPeriod() {
		return period;
	}
	
	public void setPeriod(String period) {
		this.period = period;
	}
	
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}
	
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	public int getTotalHourLesson() {
		return totalHourLesson;
	}
	
	public void setTotalHourLesson(int totalHourLesson) {
		this.totalHourLesson = totalHourLesson;
	}
	
	public String getDayOfWeekLesson() {
		return dayOfWeekLesson;
	}
	
	public void setDayOfWeekLesson(String dayOfWeekLesson) {
		this.dayOfWeekLesson = dayOfWeekLesson;
	}
	
	public String getStartHoursLesson() {
		return startHoursLesson;
	}
	
	public void setStartHoursLesson(String startHoursLesson) {
		this.startHoursLesson = startHoursLesson;
	}
}
