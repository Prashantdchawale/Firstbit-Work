package p2;

import p1.Emp;

public class SalesManager extends Emp {

    double incentive; // new variable
    int target;

    public SalesManager() {
        super();
        System.out.println("Salesmanager default constructor call");
        this.incentive = 500;
        this.target = 50;
    }

    public SalesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        System.out.println("Salesmanager parameter constructor call");
        this.incentive = incentive;
        this.target = target;
    }

    double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	public void display() {
        super.display();
        System.out.println("Incentive : " + this.incentive);
        System.out.println("Target    : " + this.target);
        System.out.println("Total Salary (Salary+Incentive) : "+calSal());
    }

    public double calSal() {
        return getSalary() + incentive;
    }
}// class Salesmanager ends here
