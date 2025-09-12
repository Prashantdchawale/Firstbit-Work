class Emp
{
	int id;
	String name;
	double salary;
	
	void setid(int id)
	{
		this.id=id;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	
	void setsalary(double salary)	
	{
		this.salary=salary;	
	}

	
	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}


	void display()
	{
	
		System.out.println(this.id+"-"+this.name+"-"+this.salary);
	}


	Emp()
	{
		System.out.println("Default");
		this.id=101;
		this.name="Ram";
		this.salary=25000.0;	
		
	}
	Emp(int i,String n,double s)
	{
		System.out.println("\nParameter");
		this.id=i;
		this.name=n;
		this.salary=s;	
		
	}


}
class Test
{
	public static void main(String []a)
	{
		Emp e1=new Emp();
		e1.display();
		Emp e2=new Emp(201,"Shayam",4500.0);
		e2.display();

	}
}