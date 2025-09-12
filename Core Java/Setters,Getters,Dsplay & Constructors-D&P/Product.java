class Product
{
	int id;
	String name;
	int quantity;
	double price;

	void setId(int id)
	{
		this.id=id;
	}

	void setName(String name)
	{
		this.name=name;
	}
	
	void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	void setPrice(double price)
	{
		this.price=price;
	}


	int getId()
	{
		return this.id;	
	}
	
	String getName()
	{
		return this.name;
	}
	int getQuantity()
	{
		return this.quantity;
	}
	double getPrice()
	{
		return this.price;
	}


	void display()
	{
		System.out.println("Id      :"+this.id);
		System.out.println("Name    :"+this.name);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Price   :"+this.price);
	}


	Product()
	{
		System.out.println("Default Constructor");
		this.id=101;
		this.name="laptop";
		this.quantity=10;
		this.price=80000.00;
	}


	Product(int i, String n, int q, double p)
	{
		System.out.println("\nParameterized Constructor");
		this.id=i;
		this.name=n;
		this.quantity=q;
		this.price=p;
	}
}//class product


class Test
{
	public static void main(String [] a)
	{
		Product p=new Product();
		p.display();

		Product p1=new Product(201,"tv",15,15000.0);
		p1.display();

	}//main end here
}//class Test end here 