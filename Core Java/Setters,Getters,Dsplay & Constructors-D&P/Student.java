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


	int getRoll()
	{
		return this.roll;
	}
	String getName()
	{
		return this.name;
	}
	double getMarks()
	{
		return this.marks;
	}


	void display()	
	{
		System.out.println("Id   :"+this.roll);
		System.out.println("Name :"+this.name);
		System.out.println("Marks:"+this.marks);
	}


	Student()
	{
		System.out.println("Default Constructor");
		this.roll=101;
		this.name="Prashant";
		this.marks=100.00;
	}


	Student(int r,String n, double m)
	{
		System.out.println("\nParameterized Constructor");
		this.roll=r;
		this.name=n;
		this.marks=m;
	}
}//class Student ends here

class Test
{
	public static void main(String [] a)
	{
		Student s1=new Student();
		s1.display();
		Student s2=new Student(201,"Rahul",100.00);
		s2.display();
	}
}