package p1;
import java.util.ArrayList;

class Student implements Comparable <Student>
{
	int roll;
	double marks;
	String name;
	
//	//To Ascending Order Of TreeSet By RollNo
	public int compareTo(Student s1) {
		System.out.println("Inside CompareTo");
		return this.roll-s1.roll;
//		return this.name.compareTo(s1.name); // ascending A→Z
//		return Double.compare(this.marks, s1.marks);

	}
	
	//To Descending Order Of TreeSet By RollNo
		//public int compareTo(Student s1) {
			//System.out.println("Inside CompareTo");
			//return s1.roll-this.roll;
			//return s1.name.compareTo(this.name); // descending Z→A
		    //return Double.compare(s1.marks, this.marks);

		//}

	
//}
	
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
		return "\nStudent roll = " +roll +", marks = " +marks +", name = " + name ;
	}
}



public class TestArrayListCollectionToContainsMethod {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));

		System.out.println(a1);

		if (a1.contains(new Student(34, 590, "Rahul")))

		{
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}