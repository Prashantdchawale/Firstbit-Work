class Distance
{
	double feet;
	double inches;
	
	void setFeet(double feet)
	{
		this.feet=feet;
	}
	void setInches(double inches)
	{
		this.inches=inches;
	}


	double getFeet()
	{
		return feet;
	}
	double getInches()	
	{
		return inches;
	}

	
	void display()
	{
		System.out.println("feet   : "+this.feet);
		System.out.println("inches : "+this.inches);
	}


	Distance()
	{
		System.out.println("Default");
		this.feet=2.0;
		this.inches=25.2;
	}
	Distance(double f,double i)
	{
		System.out.println("\nParameter");
		this.feet=f;
		this.inches=i;
	}
	

}//class Distance ends here


class Test
{
	public static void main(String []a)
	{
	
		Distance d=new Distance();
		d.display();

		Distance d1=new Distance(3.0,30.2);
		d1.display();	
	}
}	