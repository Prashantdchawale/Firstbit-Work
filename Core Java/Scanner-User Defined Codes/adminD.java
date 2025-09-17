import java.util.Scanner;

class Admin
{
	int id;
	String name;
	double salary;
	double adminallowance;
	
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
	void setAdminallowance(double adminallowance)
	{
		this.adminallowance=adminallowance;
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
	double getAdminallowance()
	{
		return adminallowance;
	}
	void display()
	{
		System.out.println("id            : "+this.id);
		System.out.println("name          : "+this.name);
		System.out.println("salary        : "+this.salary);
		System.out.println("adminallowance: "+this.adminallowance);	
	}

	Admin()
	{
		this.id=201;
		this.name="firstbit admin";
		this.salary=6000.00;
		this.adminallowance=150.30;
		System.out.println("Default call        ");
	}

	Admin(int id, String a, double s, double aa)
	{
		this.id=id;
		this.name=a;
		this.salary=s;
		this.adminallowance=aa;
		System.out.println("\n\nparameterized call");
	}
}//class Admin ends here


class Test
{
	public static void main(String []a)
	{
		Admin a1=new Admin();
		a1.display();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter admin allowance: ");
		double adminallowance = sc.nextDouble();

		Admin a2=new Admin(id, name, salary, adminallowance);
		a2.display();
 	}
}//class Test ends here
