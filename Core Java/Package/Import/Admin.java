package p2;

import p1.Emp;

public class Admin extends Emp {
double adminAllows; 
    
    Admin() {
        super();
        System.out.println("Admin default constructor call");
        this.adminAllows = 20000;

    }

    public Admin(int id, String name, double salary, double adminAllows) {
        super(id, name, salary);
        System.out.println("Admin parameter constructor call");
        this.adminAllows = adminAllows;
    }
    
    double getAdminAllows() {
		return adminAllows;
	}

	void setAdminAllows(double adminAllows) {
		this.adminAllows = adminAllows;
	}

	public void display() {
        super.display();
        System.out.println("Admin Allowance: " + this.adminAllows);
        System.out.println("Total Salary (Salary+AdminAllowance) : " +calSal());
    }

    public double calSal() {
        return getSalary() + adminAllows;
    }
}// class Admin ends here
