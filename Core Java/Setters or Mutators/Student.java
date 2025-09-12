class Student
{
	int roll;
	String name;
	double marks;

	void setRoll(int roll)
	{
		this.roll=roll;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setMarks(double marks)
	{
		this.marks=marks;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Student s1=new Student();
		
		s1.setRoll(101);
		s1.setName("Prashant");
		s1.setMarks(77.22);
		
		System.out.println("id   : "+s1.roll);
		System.out.println("name : "+s1.name);
		System.out.println("marks: "+s1.marks);
	}
}