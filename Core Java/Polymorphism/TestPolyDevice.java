// Base Class
class Device {
    String name;

    Device() {
        this.name = "Unknown Device";
    }

    Device(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(">>Device Name : " +name);
    }
} //class Device ends here


class Laptop extends Device {
    String brand;
    double weight; // in kg

    Laptop() {
        super();
        this.brand = "Unknown Brand";
        this.weight = 2.0;
        System.out.println("Laptop Default Constructor");
    }

    Laptop(String name, String brand, double weight) {
        super(name);
        this.brand = brand;
        this.weight = weight;
        System.out.println("Laptop Parameterized Constructor");
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void display() {
        super.display();
        System.out.println("Brand  : " +brand);
        System.out.println("Weight : " +weight +" kg");
    }
} //class Laptop ends here


class Mobile extends Device {
    int ram; // in GB
    double price; // in USD

    Mobile() {
        super();
        this.ram = 4;
        this.price = 300;
        System.out.println("Mobile Default Constructor");
    }

    Mobile(String name, int ram, double price) {
        super(name);
        this.ram = ram;
        this.price = price;
        System.out.println("Mobile Parameterized Constructor");
    }

    int getRam() {
        return ram;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void display() {
        super.display();
        System.out.println("RAM   : "+ram +" GB");
        System.out.println("Price : "+price);
    }
} //class Mobile ends here



class TestDevices {
    public static void main(String[] args) {
    	
        Device d1 = new Device();
        d1.display();
        System.out.println();

        d1 = new Laptop("Dell Inspiron", "Dell", 1.8);
        d1.display();
        System.out.println();

        d1 = new Mobile("Samsung Galaxy", 8, 21000);
        d1.display();
    }
}
