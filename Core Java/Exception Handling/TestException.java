public class TestException 
{
	public static void main(String[] args) 
	{	
		int a = 10,b=2;
		int c;
		
		try 
		{
			String fname=args[0];
			String lname=args[1];
			
			System.out.println("Name is   : "+fname +" "+lname);
			c=a/b;
			System.out.println("Answer is : "+c);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Pls Don't Enter Second Value as 0");
		}	
		
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Pls Provide at least two arguments from Console");
		}
		
		catch (Exception e)
		{
			System.out.println("Some Problem");
		}	
	}
}