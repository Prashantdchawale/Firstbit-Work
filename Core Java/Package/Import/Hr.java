package p2;

import p1.Emp;

public class Hr extends Emp {
double commission; 
    
    public Hr() {
        super();
        System.out.println("Hr Default constructor call");
        this.commission = 1000;
        
    }
    
    public Hr(int id, String name, double salary, double commission) {
        super(id, name, salary);
        System.out.println("Hr parameter constructor call");
        this.commission = commission;
    }

    double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	public void display() {
        super.display();
        System.out.println("Commission : "+this.commission);
        System.out.println("Total Salary (Salary+Commission) : "+calSal() +"\n");
    }

    public double calSal() {
        return getSalary() + commission;
    }
}// class Hr ends here

