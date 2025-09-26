class Shape
{
	double area;
	double perimeter;

	Shape() {
		this.area = 0;
		this.perimeter=0;
		System.out.println("Shape Default Constructor");
	}
	
	Shape(double area, double perimeter) {
		System.out.println("Shape Parameterized Constructor");
		this.area = area;
		this.perimeter = perimeter;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	double getPerimeter() {
		return perimeter;
	}

	void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	void display()
	{
		System.out.println("Area      : "+this.area);
		System.out.println("Perimeter : "+this.perimeter);

	}
}//class Shape ends here


class Square extends Shape 
{
	double side;
	
	Square() {
		super();
		System.out.println("Square Default Constructor");
		this.side = 10;
		calculate();
	}
	
	Square(double area, double perimeter,double side) {
		super(area,perimeter);
		System.out.println("Square Parameterized Constructor");
		this.side = side;
		calculate();
	}

	double getSide() {
		return side;
	}

	void setSide(double side) {
		this.side = side;
		//this.area=side*side;
		//this.perimeter=4*side;
	}
	
	void calculate() {
        this.area = side * side;
        this.perimeter = 4 * side;
    }
	
	void display() {
	    super.display();
	    System.out.println("Sides of Square : " +side);
	}
}//class Square ends here


class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle() {
		super();
		System.out.println("Rectangle Default Constructor");
		this.length = 1;
		this.width = 1;
		calculate();
	}
		
	Rectangle(double area, double perimeter,double length, double width) 
	{
		super(area,perimeter);
		System.out.println("Rectangle Parameterized Constructor");
		this.length = length;
		this.width = width;
		calculate();
	}
	void display()
	{
		super.display();
		System.out.println("Length of Rectangle : "+length);
		System.out.println("Width of Rectangle  : "+width);
	}
	
	void calculate() {
        this.area = length * width;
        this.perimeter = 2 * (length + width);
        //System.out.println();
	}
}//class Rectangle ends here


class Triangle extends Shape
{
	double base;
	double height;
	
	Triangle() {
		super();
		System.out.println("Triangle Default Constructor");
		this.base = 50;
		this.height = 10;
		calculate();
	}
	
	Triangle(double area,double perimeter,double base, double height) {
		super(area,perimeter);
		System.out.println("Triangle Parameterized Constructor");
		this.base = base;
		this.height = height;
		calculate();
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	void display()
	{
		super.display();
		System.out.println("Base  : "+base);
		System.out.println("Height: "+height);
	}
	
	void calculate()
	{
		this.area=0.5*base*height;
		this.perimeter = base + height + Math.sqrt(base * base + height * height);
	}
}//class Triangle ends here

class TestShape
{
	public static void main(String[] args) {
		
	    
		Shape s1=new Shape();
		s1.display();
	    System.out.println();

		s1=new Shape(10, 20);
		s1.display();
	    System.out.println();

	    s1= new Square();
	    s1.display();
	    System.out.println();

	    s1 = new Square(0,0,20);
	    s1.display();
	    System.out.println();

	    
	    s1=new Rectangle();
	    s1.display();
	    System.out.println();
	    
	    s1=new Rectangle(0,0,10,20);
	    s1.display();
	    System.out.println();

	    
	    s1=new Triangle();
	    s1.display();
	    System.out.println();
	    
	    s1=new Triangle(0,0,5,10);
	    s1.display();
	}
}