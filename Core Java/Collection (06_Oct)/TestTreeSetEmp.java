package hw1;

import java.util.TreeSet;

class Employee implements Comparable <Employee>
{
	int id;
	String name;
	double salary;
	
	
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;	}
	
	
	//Default Constructor
	Employee() {
		System.out.println("Emp Default Constructor");
		this.id = 0;
		this.name = "Not Given";
		salary = 0;
	}
	
	//Parameterized Constructor
	Employee(int id, String name, double salary) {
		System.out.println();		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getter and Setter methods
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	 public String toString() 
	 {
	        return "ID = " +this.id +", Name = " +this.name +", Salary = " +this.salary;
	 }

	

	 
}//class Emp ends Here


class Admin extends Employee{
	double allowance;

	Admin() 
	{
		super();
		System.out.println("Admin Default");
		this.allowance = 1000;
	}

	Admin(int id,String name,double salary,double allowance) 
	{
		super(id,name,salary);
		System.out.println("Admin parameterized");
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String toString()
	{
		return super.toString() +", allowance = "+this.allowance;
	}
}//class Admin ends here


class Hr extends Employee{
	double commission;

	
	Hr() 
	{
		super();
		System.out.println("Hr Default");
		this.commission = 6000;
	}
	
	
	Hr(int id,String name,double salary, double commission) {
		super(id,name,salary);
		System.out.println("Hr Parameterized");
		this.commission = commission;
	}


	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	public String toString()
	{
		return super.toString()+", Commission = "+this.commission;
	}
}//class Hr ends here


class SalesManager extends Employee{
	double target;
	double incentive;
	
	SalesManager(){
		super();
		System.out.println("SalesManager Default");
		this.target=100;
		this.incentive=500;
	}

	SalesManager(int id,String name,double salary, double target, double incentive) {
		super(id,name,salary);
		System.out.println("SalesManager Parameterized");
		this.target = target;
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public String toString()
	{
		return super.toString() + ", Target = "+this.target + ", Incentive = "+ this.incentive +"\n";
		
	}
	
}//class SalesManager ends here


public class TestTreeSetEmp {

	public static void main(String[] args) {

		TreeSet<Employee> a1= new TreeSet<>();
	      
        a1.add(new Admin(101 ,"Prashant",70000,1000));  
        a1.add(new Hr(104,"Janhavi",50000,400));
        a1.add(new SalesManager(102,"Rahul", 60000,700,8000));
        
        a1.add(new SalesManager(102,"Rahul", 60000,700,8000));
               	
        {
        	 System.out.println(a1.toString());

        	 
        	 //System.out.println(a1.get(8));	// it gives error : ArrayIndexOutOfBounce
        }
	}

}
