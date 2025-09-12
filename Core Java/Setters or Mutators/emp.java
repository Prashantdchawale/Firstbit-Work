class emp
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
}
class Test
{
	public static void main(String []a)
	{
		emp e1=new emp();

		e1.setid(101);
		e1.setname("ram");
		e1.setsalary(5000.00);
	
		System.out.println(e1.id+"-"+e1.name+"-"+e1.salary);
		System.out.println(e1.id+e1.name+e1.salary);
		System.out.println("id     : "+e1.id);
		System.out.println("name   : "+e1.name);
		System.out.println("salary : "+e1.salary);

	}
}