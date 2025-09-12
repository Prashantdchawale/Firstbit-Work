class Book
{
	String bid;
	String title;
	String author;
	String publisher;
	double price;
	
	void setBookId(String s)
	{
		this.bid=s;
	}
	void setTitle(String  t)
	{
		this.title=t;
	}
	void setAuthor (String a)
	{
		this.author=a;
	}
	void setPublisher (String p)
	{
		this.publisher=p;
	}
	void setPrice(double p)
	{
		this.price=p;
	}
	String getBookId()
	{ 	
		return bid;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	String getPublisher()
	{
		return publisher;
	}
	double getPrice()
	{
		return price;
	}
	void display()
	{
		System.out.println("Book_Id  :"+this.bid);
		System.out.println("Title    :"+this.title);
		System.out.println("Author   :"+this.author);
		System.out.println("Publisher:"+this.publisher);
		System.out.println("Price    :"+this.price);
	}

	Book()
	{
		this.bid="4";
		this.title="tulishidas";
		this.author="ramayan";
		this.publisher="ramachitra";
		this.price=4444.2;
	}
	
	Book(String i, String t,String a, String p, double pr)
	{
		this.bid=i;
		this.title=t;
		this.author=a;
		this.publisher=p;
		this.price=pr;

	}
}
class Test
{
	public static void main(String [] a)
	{
		Book b1=new Book();
		b1.display();
		Book b2=new Book("5000","navaneet","nikita","bharat",30.00);
		b2.display();
	}
}
	