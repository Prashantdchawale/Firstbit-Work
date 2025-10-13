package p1;

import java.io.Serializable;

public class Student implements Serializable{
	int roll;
	String name;
	double marks;
	
	Student() {
		
	}
	
	Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	 

}
