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
		System.out.println("Default Constructor");
		this.id=101;
		this.name="Ram";
		this.salary=25000.0;	
		
	}
	Emp(int i,String n,double s)
	{
		System.out.println("\nParameterized Constructor");
		this.id=i;
		this.name=n;
		this.salary=s;	
		
	}
}

class Test
{
	public static void main(String []args)
	{
        int i;
		Emp[]brr=new Emp[5];

		for(i=0;i<brr.length;i++)
        System.out.println(brr[i]);
		//prints null 5 times

		brr[0]= new Emp();
		brr[1]= new Emp(101,"Prashant",90000);//parameterized 
        System.out.println(brr[1].name);
  

        
    }
} 
