// Q1. Product Class
// Create a class `Product` with the following members:
// - pid (product id)
// - pname (product name)
// - costPrice
// - quantity

// Add a static data member `discount` (common for all products).
// - Provide a method to apply discount on the product's cost price.
// - Provide another method to calculate and return the selling price of the product.

class Product
{
    int pid;
    String name;
    double costPrice;
    int quantity;
    static double discount;
    static
    {
        discount=10;
    }


    //Setters
    void setPId(int i)
    {
        this.pid=i;
    }

    void setName(String n)
    {
        this.name=n;
    }

    void setCostPrice(double c)
    {
        this.costPrice=c;
    }

    void setQuantity(int q)
    {
        this.quantity=q;
    }

    static void setDiscount(double d)
    {
        //this.discount=d;
               discount=d;
    }


    //Getters
    int getPId()
    {
        return pid;
    }

    String getName()
    {
        return name;
    }

    double getCetCostPrice()
    {
        return costPrice;
    }

    int getQuantity()
    {
        return quantity;
    }

    double getDiscount()
    {
        return discount;
    }


    void display()
    {
        System.out.println("P_Id        : "+this.pid);
        System.out.println("P_Name      : "+this.name);
        System.out.println("P_CostPrice : "+this.costPrice);
        System.out.println("P_Quantity  : "+this.quantity);
        System.out.println("P_Discount  : "+this.discount+"\n\n");
    }


    //Default Constructor
    Product()
    {
        this.pid=101;
        this.name="Prashant";
        this.costPrice=500;
        this.quantity=10;
        //this.discount=10;
        System.out.println("Deault Constructor");
    }

    //Parameterized Constructor
    Product(int i,String n,double c, int q)
    {
        this.pid=i;
        this.name=n;
        this.costPrice=c;
        this.quantity=q;
        //this.discount=d;
    System.out.println("Parameterized Constructor");
    }


    void calculatePrices()
    {
        double totalCost = costPrice * quantity;
        System.out.println("Cost Price   = " + totalCost);

        double sellingPrice = totalCost - discount;
        System.out.println("Selling Price= " + sellingPrice+"\n\n");
    }
}//Product class ends here


class Test
{
    public static void main (String [] a)
    {
        Product p1 = new Product(01,"WaterBottle",100,5);
        p1.display();
        p1.calculatePrices();

        Product.setDiscount(50);

        p1.display();
        p1.calculatePrices();
    } 
}//class Test ends here