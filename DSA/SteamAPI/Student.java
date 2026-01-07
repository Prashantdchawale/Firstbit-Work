package com.phoenix.demos;

public class Student {

	int rollNo;
	String studName;
	float marks;
	String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int v1, String v2, float v3, String v4)
	{
		rollNo=v1;
		studName=v2;
		marks=v3;
		gender=v4;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
