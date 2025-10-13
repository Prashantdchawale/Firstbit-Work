package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int roll;
	double marks;
	String name;


	public Student() {
		this.roll = 101;
		this.marks = 7;
		this.name = "not given";

	}

	public Student(int id, double marks, String name) {
		this.roll = id;
		this.marks = marks;
		this.name = name;
	}

	public int getId() {
		return roll;
	}

	public void setId(int id) {
		this.roll = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\n Student roll=" + roll + ", marks=" + marks + ", name=" + name;
	}

}// class Student ends here


class MyStudentMarksComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub\
		Student s1= (Student)o1;
		Student s2= (Student)o2;
		
		return (int) (s1.marks-s2.marks);
	}
}//class MyStudentMarksComparator ends here


public class TestDemo
{

	public static void main(String[] args) {
		ArrayList<Student> arrlist = new ArrayList<Student>();
		arrlist.add(new Student(57, 1450, "Sachin"));
		arrlist.add(new Student(34, 590, "Rahul"));
		arrlist.add(new Student(88, 7000, "Dhoni"));

		MyStudentMarksComparator m1= new MyStudentMarksComparator();
		Collections.sort(arrlist, m1);

		MyStudentRollComparator rc= new MyStudentRollComparator();
		Collections.sort(arrlist, rc);
		
		MyStudentnameComparator nc= new MyStudentnameComparator();
		Collections.sort(arrlist, nc);
		
		System.out.println(arrlist);
		System.out.println();
		
		
		
		
		// Sort by Marks
        Collections.sort(arrlist, new MyStudentMarksComparator());
        System.out.println("\nSorted by Marks (Ascending): " + arrlist);
        
        // Sort by Roll
        Collections.sort(arrlist, new MyStudentRollComparator());
        System.out.println("\nSorted by Roll (Ascending): " + arrlist);
        
        // Sort by Name
        Collections.sort(arrlist, new MyStudentnameComparator());
        System.out.println("\nSorted by Name (A-Z): " + arrlist);
	}

}




