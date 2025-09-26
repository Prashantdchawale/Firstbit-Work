class Emp {
    int id;
    String name;
    double salary;

    Emp() {
        System.out.println("Emp Default constructor call");
        this.id = 01;
        this.name = "ajay";
        this.salary = 75000;
    }

    Emp(int id, String name, double salary) {
        System.out.println("Emp parameterized constructor call");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    

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

	void display() {
        System.out.println(">>Emp Id    : " + this.id);
        System.out.println(">>Emp Name  : " + this.name);
        System.out.println(">>Emp Salary: " + this.salary);
    }
    double calSal() {
        return salary;
    }
}// class Emp ends here


class Hr extends Emp {
    double commission; 
    
    Hr() {
        super();
        System.out.println("Hr Default constructor call");
        this.commission = 1000;
        
    }
    
    Hr(int id, String name, double salary, double commission) {
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

	void display() {
        super.display();
        System.out.println("Commission : "+this.commission);
        System.out.println("Total Salary (Salary+Commission) : "+calSal());
    }

    double calSal() {
        return salary + commission;
    }
}// class Hr ends here


class Salesmanger extends Emp {
    double incentive; // new variable
    int target;

    Salesmanger() {
        super();
        System.out.println("Salesmanager default constructor call");
        this.incentive = 500;
        this.target = 50;
    }

    Salesmanger(int id, String name, double salary, double incentive, int target) {
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

	void display() {
        super.display();
        System.out.println("Incentive : " + this.incentive);
        System.out.println("Target    : " + this.target);
        System.out.println("Total Salary (Salary+Incentive) : "+calSal());
    }

    double calSal() {
        return salary + incentive;
    }
}// class Salesmanager ends here


class Admin extends Emp {
    double adminAllows; 
    
    Admin() {
        super();
        System.out.println("Admin default constructor call");
        this.adminAllows = 20000;

    }

    Admin(int id, String name, double salary, double adminAllows) {
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

	void display() {
        super.display();
        System.out.println("Admin Allowance: " + this.adminAllows);
        System.out.println("Total Salary (Salary+AdminAllowance) : " +calSal());
    }

    double calSal() {
        return salary + adminAllows;
    }
}// class Admin ends here


class AsalesManger extends Salesmanger {
    String area; 
    
    AsalesManger() {
        super();
        System.out.println("AsM Default Constructor");
        this.area = "C.Shivaji Maharaj - Nagar";

        
    }

    AsalesManger(String area, int id, String name, double salary, double incentive, int target) {
        super(id, name, salary, incentive, target);
        System.out.println("AsM Parameterized Constructor");
        this.area = area;
    }
    
    String getArea() {
		return area;
	}

	void setArea(String area) {
		this.area = area;
	}

	void display() {
        super.display();
        System.out.println("Area allocated: " + this.area);
        System.out.println("Total Salary (Salary+Incentive) : " +calSal());
    }
}// class AsalesManager ends here


class TestEmployee {
    public static void main(String[] args) {
    	
        Emp e1;

        e1 = new Salesmanger(102, "Rahul", 80000, 5000, 30);
        TestEmployee.myfun(e1);
        
        e1 = new Hr(104, "Dhoni", 50000, 7000);
        TestEmployee.myfun(e1);
    }

        private static void myfun(Emp e1) {
            System.out.println("Name : " + e1.getName());
            System.out.println("Calculated Salary : " + e1.calSal());

            if (e1 instanceof Salesmanger) {		//Downcasting using by instanceof

                Salesmanger s1 = (Salesmanger) e1;  //Downcasting
                System.out.println("Incentive : " + s1.getIncentive());
            } 
            else if (e1 instanceof Hr) {
                Hr h1 = (Hr) e1;				    //Downcasting
                System.out.println("Commission : " + h1.getCommission());
            }
            
        }
    }