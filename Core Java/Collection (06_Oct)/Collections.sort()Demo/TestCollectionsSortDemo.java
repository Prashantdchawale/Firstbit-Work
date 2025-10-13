package p1;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable <Student>
{
	int roll;
	double marks;
	String name;
	
//	//To Ascending Order Of TreeSet By RollNo
	public int compareTo(Student s1) {
		System.out.println("Inside CompareTo");
		return this.roll-s1.roll;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Inside equals");
		Student s1=(Student)obj;
		if (this.roll==s1.roll)
		return true;
		else return false;
	}
	
	
	
	
	Student() 
	{
		this.roll = 101;
		this.marks = 80;
		this.name = "Prashant";
	}

	Student(int roll, double marks, String name) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}

	int getRoll() {
		return roll;
	}

	void setRoll(int roll) {
		this.roll = roll;
	}

	double getMarks() {
		return marks;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\nStudent roll = " +roll +", marks = " +marks +", name = " +name ;
	}
}//Class Student ends here 



public class TestCollectionsSortDemo {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));
		
		
		System.out.println("Before Sorting\n" +a1);

		Collections.sort(a1);		//Sort Static Function Of Collections class
		System.out.println("After Sorting\n" +a1);
		
		for(Student s1 : a1) {
			System.out.println(s1.getName());
		}
	}
}
