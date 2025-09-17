import java.util.Scanner;
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
		Scanner sc=new Scanner(System.in);
		course c1;
		c1=new course();
		c1.display();
		System.out.print("Enter CourseId   : ");
		int ab=sc.nextInt();
		System.out.print("Enter Course Name: ");
		String ac=sc.next();
		System.out.print("Enter Duration   : ");
		String ad=sc.next();
		System.out.print("Enter Fees of Course: ");
		double ae=sc.nextDouble();
		course c2;
		c2=new course(ab,ac,ad,ae);
		c2.display();
	}
}