class Shape 
{    
    void area(Triangle t1)
    {
        double result = 0.5 *  t1.getBase() * t1.getHeight();
        System.out.println("Area Of Triangle is  : " + result+"\n");
    }

    void area(Rectangle r1) 
    {
        double result = r1.getLength()*r1.getBreath();
        System.out.println("Area Of Rectangle is : " + result+"\n");
    }

   
    void area(Circle c1) 
    {
        double result = 3.14 *c1.getRadius() * c1.getRadius();
        System.out.println("Area Of Circle is    : " + result+"\n");
    }
}//class end

class Triangle
{
	double base;
	 double height;


	Triangle()
	{
		this.base=10;
		this.height=5;
	}
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	void setBase(double base)
	{
		this.base=base;
	
	}
	void setHeight(double height)
	{
		this.height=height;
	}
	double getBase()
	{
		return base;
	}
	double getHeight()
	{
		return height;
	}
	void display()
	{
		System.out.println("base  :"+this.base);
		System.out.println("height:"+this.height);
	}
}//class triangle end here


class Circle
{
	double radius;
	Circle()
	{
		this.radius=2;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	void setRadius(double radius)
	{
		this.radius=radius;
	}
	double getRadius()
	{
		return radius;
	}
	void display()
	{
        System.out.println("radius:"+this.radius);
	}
}//class circle ends here


class Rectangle
{
	double length;
	double breadth;
	Rectangle()
	{
		this.length=2;
		this.breadth=4;
	}
	Rectangle(double l,double b)
	{
		this.length=l;
		this.breadth=b;
	}
	void setLength(double length)
	{
		this.length=length;
	}
	void setBreath(double b)
	{
		this.breadth=b;
	}
	double getLength()
	{
		return length;
	}
	double getBreath()
	{
		return breadth;
	}
	void display()
	{
	    System.out.println("length : "+this.length);
	    System.out.println("breadth: "+this.breadth);
	}
}//class rectangle ends here

	
class Test
{
	public static void main(String [] a)
	{
		Shape s1=new Shape();

		Triangle t1=new Triangle(10.0,20.0);
		t1.display();
		s1.area(t1);
		
		Circle c1=new Circle(15.0);
		c1.display();
		s1.area(c1);
		
		Rectangle r1=new Rectangle(10.0,20.0);	
        r1.display();
		s1.area(r1);
	}
}