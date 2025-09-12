class PlacedStudent
{
	String c_name;
	double distance;
	String destination;

	void setCname(String cname)
	{
		this.c_name=cname;
	}
	void setDistance (double distance)
	{
		this.distance=distance;
	}
	void setDestination (String destination)
	{
		this.destination=destination;
	}
	

	String getCname()
	{
		return c_name;
	}
	double getDistance()
	{
		return distance;
	}
	String getDestination()
	{
		return destination;
	}


	void display()
	{
	
		System.out.println("Company name:"+this.c_name);
		System.out.println("Distance    :"+this.distance);
		System.out.println("Destination :"+this.destination);
	}


	PlacedStudent()
	{
		this.c_name="Firstbit";
		this.distance=1.5;
		this.destination="hr";
	}


	PlacedStudent(String c, double di,String de)
	{
		System.out.println("\nParameterized Constructor");
		this.c_name=c;
		this.distance=di;
		this.destination=de;
	}
}//class P_student


class Test
{
	public static void main(String []a)
	{
		PlacedStudent p1=new PlacedStudent();
		p1.display();

		PlacedStudent p2=new PlacedStudent("Fbs",1.0,"IT");
		p2.display();
	}
}	