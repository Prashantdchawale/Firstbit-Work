// Q2. Shirt Class
// Create a class `Shirt` with the following members:
// - sid (shirt id)
// - brand
// - type (e.g., formal, casual)
// - price
// - size (small, medium, large, x-large)

// Use the static concept to implement the following:
// - For each shirt size, the price should vary by 10% increment.
//   Example: if base price = 1000
//     - Small = 1000
//     - Medium = 1100
//     - Large = 1200
//     - X-Large = 1300

// Write methods to calculate and display the final price of a shirt based on its size.




class Shirt
{
    int sid;
    String brand;
    String type;
    String size;

    static double price;
    static
    {
        price=1000;
    }

    static double increment;   // percentage increment per size step
    static 
    {
        increment = 0.10;      // 10% increment step
    }


    //Default Constructor
    Shirt()
    {
        this.sid=1;
        this.brand="Raymond";
        this.type="Casual";
        // this.price=1000;
        this.size="Small";
        System.out.println("Default Constructor");
    }


    //Parameterized Constructor
    Shirt(int i, String b, String t, String s)
    {
        this.sid=i;
        this.brand=b;
        this.type =t;
        // this.price= p;
        this.size=s;
        System.out.println("Parameterized Constructor");
    }


    //Setters
    void setId(int sid) 
    {
        this.sid = sid;
    }

    void setBrand(String brand)
    {
        this.brand = brand;
    }

    void setType(String type)
    {
        this.type = type;
    }

    void setPrice(double price)
    {
        this.price = price;
    }
    void setSize(String size)
    {
        this.size = size;
    }
    static void setIncrement(double i)
    {
        increment=i;
    }


    //Getters
    int getSid()
    {
        return sid;
    }
    
    String getBrand() 
    {
        return brand;
    }
    String getType() 
    {
        return type;
    }
    double getPrice() 
    {
        return price;
    }
    String getSize() 
    {
        return size;
    }

    double getIncrement() 
    {
        return increment; 
    }


    void display() 
    {
        System.out.println("S_ID   : " + this.sid);
        System.out.println("Brand  : " + this.brand);
        System.out.println("Type   : " + this.type);
        System.out.println("Size   : " + this.size + "\n");
        // System.out.println("Final Price  : " + this.price);

    }


    double calculatePrice() 
    {
        switch(size.toLowerCase())
        {
            case "small":
            return price;
            
           case "medium":
                return price * (1 + increment);      // +10%
            
            case "large":
                return price * (1 + 2 * increment);  // +20%
            
            case "x-large":
                return price * (1 + 3 * increment);  // +30%

        default:
            System.out.println("Invalid size! Taking Small as default.");
            return price;
        }
    }

    void finalPrice()
    {
        double finalPrice = calculatePrice();
        System.out.println("Final Price of Shirt (" + brand + ") = " + finalPrice + "\n");
    }
}//class Shirt end here


class Test 
{
    public static void main(String[] args)
    {
        Shirt s1 = new Shirt();
        s1.display();
        s1.finalPrice();

        Shirt s2 = new Shirt(102, "Peter England", "Casual","medium");
        s2.display();
        s2.finalPrice();

        Shirt s3 = new Shirt(103, "Allen Solly", "Formal", "Large");
        s3.display();
        s3.finalPrice();

        Shirt s4 = new Shirt(104, "Van Heusen", "Formal", "x-large");
        s4.display();
        s4.finalPrice();

        // Shirt.setIncrement(0.20);     //changed Increment from static
        // s1.display();
        // s1.finalPrice();

        // s2.display();
        // s2.finalPrice();

        // s3.display();
        // s3.finalPrice();

        // s4.display();
        // s4.finalPrice();
    }
}//class Test ends here