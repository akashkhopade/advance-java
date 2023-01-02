package com.sarje.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private StudentPk studentPk;
	private String name;
	private float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(StudentPk studentPk, String name, float marks) {
		super();
		this.studentPk = studentPk;
		this.name = name;
		this.marks = marks;
	}
	public StudentPk getStudentPk() {
		return studentPk;
	}
	public void setStudentPk(StudentPk studentPk) {
		this.studentPk = studentPk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return studentPk + " " + name + " " + marks;
	}
	
}
