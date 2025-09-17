import java.util.Scanner;
class Date
{
	int day ,month ,year;
	String dow;

	void setDay(int a)
	{
		this.day=a;
	}

	void setMonth(int a)
	{
		this.month=a;
	}
	void setYear(int a)
	{
		this.year=a;
	}
	void setDow(String str)
	{
		this.dow=str;
	}

	int getDay()
	{
		return this.day;

	}

	int getMonth()
	{
		return this.month;
	}
	int getYear()
	{	
		return this.year;
	}
	String getDow()
	{
		return this.dow;
	}

	void display()
	{
			System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear()+"-"+this.getDow());
	}
	Date()
	{
		this.day=8;
		this.month=9;
		this.year=2025;
		this.dow="mon";
		System.out.println("Default call:");
	}
	Date(int d,int m, int y, String s)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=s;
		System.out.println("parameter call:");

	}	
		
}//class time end here

class Test
{
	public static void main(String []a)
  	
	{
		Date d1;
		d1=new Date();
		d1.display();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day  :");
        int ad = sc.nextInt(); 
        System.out.print("Enter Month:");
        int am = sc.nextInt(); 
        System.out.print("Enter DoW  :");
        String adow = sc.next(); 

		Date d2;
		d2=new Date(ad,am,2025,adow );
		d2.display();

  	}//main end
}//class source end