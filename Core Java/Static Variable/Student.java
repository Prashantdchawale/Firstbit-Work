class Student
{
    int fbs_id;
    String s_name;
    int distance_travelled;
    static int s_count;
    static
    {
        s_count=0;
    }

    //Default Constructor
    Student()
	{
		this.fbs_id=101;
		this.s_name="ABC";
		this.distance_travelled=0;
        s_count++;

		System.out.println("Default constructor:");
	}

    //Parameterized Constructor
	Student(int i,String n,int d)
	{
		this.fbs_id=i;
		this.s_name=n;
		this.distance_travelled=d;
        s_count++;

		System.out.println("Parameterized constructor:\n");
	}

    //setters
    void setId(int i)
	{
		this.fbs_id=i;
	}
	void setSName(String n)
	{
		this.s_name=n;
	}
	void setDistaceTravelled(int d)
	{
		this.distance_travelled=d;
	}
	static void setSCount(int c)  //used static
	{
		s_count=c;
	}


    //Getters
    int getId()
	{
		return fbs_id;
	}
	String getSName()
	{
		return s_name;
	}
	int getCountDistaceTravelled()
	{
		return distance_travelled;
	}
	static int getCount()
    {
        return s_count;
    }


    void display()
	{
		System.out.println("FBS_Id       :"+fbs_id);
		System.out.println("Student_Name :"+s_name);
		System.out.println("Distance Travelled:"+distance_travelled);
		//System.out.println("Student_Count:"+s_count+"\n");
    }
}//class Student ends here


class Test
{
    public static void main (String [] a)
    {
    Student s1=new Student(1,"Prashant",100);
    s1.display();
    Student s2=new Student(2,"Rahul",200);
    s2.display();

    // s2.display();
    //s1.display();
    
    Student.getCount();
    }
}//class Test ends here


    