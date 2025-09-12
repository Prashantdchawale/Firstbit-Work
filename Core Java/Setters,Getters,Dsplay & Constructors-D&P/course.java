class course
{
	int courseid;
	String cname;
	String duration;
	double fees;
	
	void setcId(int id)
	{
		this.courseid=id;
	}
	void setcName(String name)
	{
		this.cname=name;
	}
	void setDuration(String duration)
	{
		this.duration=duration; 	
	}
	void setFees(double fees)	
	{
		this.fees=fees;
	}
	
	int getId()
	{
		return courseid;
	}
	String getcName()
	{
		return cname;
	}
	String getDuration()	
	{
		return duration;
	}
	double getFees()	
	{
		return fees;
	}
	
	void display()
	{
		System.out.println("cid     :"+this.courseid);
		System.out.println("cname   :"+this.cname);
		System.out.println("duration:"+this.duration);
		System.out.println("fees    :"+this.fees);
	}
	course()
	{
		System.out.println("Default constructor:");
		this.courseid=1;
		this.cname="java";
		this.duration="5 months";
		this.fees=40000.00;
		
	}
	course(int id,String name,String duration,double fees)
	{
		System.out.println("\nparameters constructor:");
		this.courseid=id;
		this.cname=name;
		this.duration=duration; 	
		this.fees=fees;

	}
}

class Test
{
	public static void main(String []a)
	{
		course c1;
		c1=new course();
		c1.display();

		course c2;
		c2=new course(201,"cyber security","2months",6542.01);
		c2.display();
	}
}