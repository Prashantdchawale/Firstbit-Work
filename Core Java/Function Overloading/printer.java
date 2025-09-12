class Printer
{
	void print (char a)
	{
	System.out.println("Char is: "+a);
	}

	void print (int ab)
	{
	System.out.println("Int is: "+ab);
	}

	void print (String x)
	{
	System.out.println("String is: "+x);
	}
}// class Printer ends here

class Test
{
	public static void main (String [] args)
	{
		Printer p1=new Printer();
		p1.print('A');
		p1.print(10);
		p1.print("Prashant");
	}
}
	
