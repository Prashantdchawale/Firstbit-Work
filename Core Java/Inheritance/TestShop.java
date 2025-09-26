// Base Class
class Shop {
    String name;
    String location;

    Shop() {
        this.name = "Vishwa Super Market";
        this.location = "Not Available";
    }

    Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void display() {
        System.out.println("Shop Name    : " +name);
        System.out.println("Shop Location: " +location);
    }
} // Shop ends


// Grocery Class
class Grocery extends Shop {
    int numberOfItems;
    boolean hasVegetables;

    Grocery() {
        super();
        this.numberOfItems = 100;
        this.hasVegetables = true;
        System.out.println("Grocery Default Constructor");
    }

    Grocery(String name, String location, int numberOfItems, boolean hasVegetables) {
        super(name, location);
        this.numberOfItems = numberOfItems;
        this.hasVegetables = hasVegetables;
        System.out.println("Grocery Parameterized Constructor");
    }

    int getNumberOfItems() {
        return numberOfItems;
    }

    void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    boolean getHasVegetables() {
        return hasVegetables;
    }

    void setHasVegetables(boolean hasVegetables) {
        this.hasVegetables = hasVegetables;
    }

    void display() {
        super.display();
        System.out.println("Number of Items: " +numberOfItems);
        System.out.println("Has Vegetables : " +(hasVegetables ? "Yes" : "No"));
    }
} // class Grocery ends


class Electronics extends Shop {
    int warranty; 
    String brandType;

    Electronics() {
        super();
        this.warranty = 12;
        this.brandType = "Mixed";
        System.out.println("Electronics Default Constructor");
    }

    Electronics(String name, String location, int warranty, String brandType) {
        super(name, location);
        this.warranty = warranty;
        this.brandType = brandType;
        System.out.println("Electronics Parameterized Constructor");
    }

    int getWarranty() {
        return warranty;
    }

    void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    String getBrandType() {
        return brandType;
    }

    void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    void display() {
        super.display();
        System.out.println("Warranty    : "+warranty +" months");
        System.out.println("Brand Type  : "+brandType);
    }
} // class Electronics ends ends


class Clothing extends Shop {
    String sizeRange;
    String material;

    Clothing() {
        super();
        this.sizeRange = "S to XL";
        this.material = "Cotton";
        System.out.println("Clothing Default Constructor");
    }

    Clothing(String name, String location, String sizeRange, String material) {
        super(name, location);
        this.sizeRange = sizeRange;
        this.material = material;
        System.out.println("Clothing Parameterized Constructor");
    }

    String getSizeRange() {
        return sizeRange;
    }

    void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }

    String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void display() {
        super.display();
        System.out.println("Size Range : " +sizeRange);
        System.out.println("Material   : " +material);
    }
} // class Clothing ends here


class TestShop {
    public static void main(String[] args) {
    	
        Shop s1 = new Shop();
        s1.display();
        System.out.println();

        Grocery g1 = new Grocery();
        g1.display();
        System.out.println();

        Grocery g2 = new Grocery("FreshMart", "City Center", 200, true);
        g2.display();
        System.out.println();

        Electronics e1 = new Electronics("TechWorld", "Mall", 24, "Sony");
        e1.display();
        System.out.println();
//
//        Clothing c1 = new Clothing("StyleHub", "Market Street", "XS to XXL", "Polyester");
//        c1.display();
    }
}
