package p1;

public abstract class Emp {
		int id;
	    String name;
	    double salary;

	    public Emp() {
	        System.out.println("Emp Default constructor call");
	        this.id = 01;
	        this.name = "ajay";
	        this.salary = 75000;
	    }

	    public Emp(int id, String name, double salary) {
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

		public String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		void setSalary(double salary) {
			this.salary = salary;
		}

		public void display() {
	        System.out.println(">>Emp Id    : " + this.id);
	        System.out.println(">>Emp Name  : " + this.name);
	        System.out.println(">>Emp Salary: " + this.salary);
	    }
	    public abstract double calSal();
	}// class Emp ends here

