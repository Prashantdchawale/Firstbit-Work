class Car
{
	int model;
	int year;
	double price;
	String brand;
	
	void setModel(int model)
	{
		this.model=model;
	}
	
	void setYear(int year)
	{
		this.year=year;
	}
	
	void setPrice(double price)
	{
		this.price=price;	
	}
	
	void setBrand(String brand)
	{
		this.brand=brand;
	}


	int getModel()
	{
		return this.model;
	}
	int getYear()
	{
		return this.year;
	}
	double getPrice()
	{
		return this.price;
	}
	String getBrand()
	{
		return this.brand;
	}


	void display()
	{
	
		System.out.println("Model:"+this.model);
		System.out.println("Year :"+this.year);
		System.out.println("Price:"+this.price);
		System.out.println("Brand:"+this.brand);
	}


	Car()
	{
		this.model=800;	
		this.year=2024;
		this.price=5024.20;
		this.brand="Maruti";
		System.out.println("Default call ");
	}


	Car(int m,int y,double p, String b)
	{
		this.model=m;	
		this.year=y;
		this.price=p;
		this.brand=b;
		System.out.println("\nparameterized call");
	}


}
class Test
{
	public static void main(String []a)
	{
		Car d1=new Car();
		d1.display();
		Car c2=new Car(100,2025,41500.0,"RX");
		c2.display();
	}
}	