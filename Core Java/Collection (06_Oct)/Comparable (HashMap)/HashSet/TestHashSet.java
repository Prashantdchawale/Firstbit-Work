import java.util.HashSet;


class Student implements Comparable <Student>
{
	int roll;
	double marks;
	String name;
	
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
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");
		Student s1=(Student)obj;
		if (this.roll==s1.roll)
		return true;
		else return false;
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("inside hashcode");		
		return this.roll;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roll;
	}
	
}//class Student ends here



public class TestHashSet {
	
public static void main(String[] args) {
		
		HashSet<Student> s1=new HashSet<Student>();
		s1.add(new Student(57, 450, "Sachin"));
		s1.add(new Student(34, 590, "Dravid"));                    
		s1.add(new Student(88, 700, "Dhoni"));		 	
		s1.add(new Student(88, 700, "Dhoni"));		 	
		s1.add(new Student(88, 700, "Dhoni"));		 	
		s1.add(new Student(34, 590, "Dravid"));                    

		
		System.out.println(s1);
		
		if(s1.contains(new Student(34,600,"Dravid")))
		{
			System.out.println("Found");
		}else
		{
			System.out.println("Not Found");
		}
		
	}
}