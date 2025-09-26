package p3;

import p1.Emp;
import p2.Admin;
import p2.Hr;
import p2.SalesManager;

public class Test 
{
	public static void main(String[] args) 
	{
		Emp e1;
		Emp[] arr=new Emp[3];
		
//		arr[0] = new Hr(1, "Ajay", 50000);
//		arr[1] = new Emp(2, "Vijay", 60000);
//		arr[2] = new Emp(3, "Sanjay", 70000);

		
		
		e1=new Hr();
		e1.display();
		e1 =new Hr(101,"sachin",5000,254.2);
		e1.display();
		System.out.println();

//		Salesmanger s1=new Salesmanger();
//		s1.display();
//		Salesmanger s2=new Salesmanger(101,"sachin",5000,5000,20);
//		s2.display();
//		System.out.println();

//		Admin a1=new Admin();
//		a1.display();
//		Admin a2=new Admin(101,"sachin",5000,1000.0);
//		a2.display();
//		System.out.println();

		
//		System.out.println(arr[0].getName());  
//		System.out.println(arr[1].getSalary());
		
Emp[] e = new Emp[5];
		
		
		e[0] = new SalesManager(101,"sachin",30000,3000,30);
		e[1] = new Admin(102,"rucha",40000,4000);
		e[2] = new Hr(103,"riya",50000,5000);
		
		
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
			System.out.println("----------------");
		}
		
	}
}
			
