class Hr
{
	int id;
	String name;
	double salary;
	double commission;
	
	void setId(int id)
	{
		this.id=id;
	}
 	void setName(String name)
	{
 		this.name=name;
	}
 	void setSalary(double salary)
	{
 		this.salary=salary;
	}
	void setCommission(double commission)
	{
		this.commission=commission;
	}

	
	int getId()
	{
		return id;
	}
 	String getName()
	{
		return name;
	}
	double getSalary()
	{
 		return salary;
	}
	double  getComission()
	{
		return commission;
	}


	void display()
	{		
		System.out.println("id        :"+this.id);
		System.out.println("name      :"+this.name);
		System.out.println("salary    :"+this.salary);
		System.out.println("commission:"+this.commission);
	}


	Hr()
	{
		this.id=101;
		this.name="Ram";
		this.salary=6500.00;
		this.commission=500.00;
	}


	Hr(int i,String n, double s,double c)
	{
		System.out.println("\nParameter");
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commission=c;
		
	}
}//class Hr ends here


class Test
{
	public static void main(String [] a)
	{
		Hr h1=new Hr();
		h1.display();
		Hr h2=new Hr(201,"Shyam",365000.0,1000.0);
		h2.display();
	}
}	
		
 