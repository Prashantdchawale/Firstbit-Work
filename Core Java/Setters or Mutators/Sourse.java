class Date 
{
int day,month,year;
String dow;
}// class Date ends here

class Test
{
	public static void main (String [] a)
	{
		Date d1=new Date ();
		d1.day=2;
		System.out.println(d1.day);

		System.out.println(d1.month);
		System.out.println(d1.year);
		
		d1.dow="Wed";
		System.out.println(d1.dow);

		
}
}
