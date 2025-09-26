class Vehicle {
    String brand;
    String model;
    int speed;
    
    Vehicle() {
		this.brand = "Activa";
		this.model = "6G";
		this.speed = 100;
	}

    Vehicle(String brand, String model, int speed) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed +"km/h");
    }
}//class Vehicle ends here


class Car extends Vehicle {
    int doors;
    String fuelType;
    
    Car() {
        super();
        this.doors = 4;
        this.fuelType = "Diseal";
    }
    
    Car(String brand, String model, int speed, int doors, String fuelType) {
        super(brand, model, speed);
        this.doors = doors;
        this.fuelType = fuelType;
    }
    
    
    int getDoors() {
		return doors;
	}

	void setDoors(int doors) {
		this.doors = doors;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	void display() {
        super.display();
        System.out.println(">>Doors    : " + doors);
        System.out.println(">>Fuel Type: " + fuelType);
    }
}//class Car ends here


class Bike extends Vehicle {
    private static final boolean Yes = false;
	String type; 
    String hasGear;
    
    Bike() {
        super();
        this.type = "Sports";
        this.hasGear = "yes";
    }
    
    Bike(String brand, String model, int speed, String type, String hasGear) {
        super(brand, model, speed);
        this.type = type;
        this.hasGear = hasGear;
    }
    
    
    
    String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String getHasGear() {
		return hasGear;
	}

	void setHasGear(String hasGear) {
		this.hasGear = hasGear;
	}

	void display() {
        super.display();
        System.out.println(">>Bike Type: " + type);
        System.out.println(">>Has Gear : " + hasGear);
    }
    //
}//class Bike ends here


class Truck extends Vehicle {
    int capacity; 
    int wheels;

    Truck() {
        super();
        this.capacity = 10;
        this.wheels = 18;
    }
    
    Truck(String brand, String model, int speed, int capacity, int wheels) {
        super(brand, model, speed);
        this.capacity = capacity;
        this.wheels = wheels;
    }
    
    
    
    int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	int getWheels() {
		return wheels;
	}

	void setWheels(int wheels) {
		this.wheels = wheels;
	}

	void display() {
        super.display();
        System.out.println(">>Capacity: " + capacity + " tons");
        System.out.println(">>Wheels  : " + wheels);
    }   
}//Truck class ends here


class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println();
        
        v1 = new Bike("Yamaha", "R15", 150, "Sports", "true");
        v1.display();
        System.out.println();

        v1 = new Truck("Tata", "Xpress", 120, 10, 6);
        v1.display();
    }
}
