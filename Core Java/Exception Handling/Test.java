package p1;
class VoterAgeException extends Exception
{
	public String toString() 
	{
		return "Invalid Age";
	}
}//class VoterAgeException ends here

class Voter 
{
	int age;
	
	public Voter(int age) 
	{
		this.age=age;
	}
	
	public void validiate() thows VoterAgeException
	{
		try 
		{	
			if (this.age<18) 
			{
			throw new VoterAgeException();
			}
		else
		{
			System.out.println("Yes you can Vote");
		}
		}
		catch (VoterAgeException ve) 
		{
		System.out.println(ve);
		}
}//validiate class ends here
}//voter class ends here


public class Test{
	public static void main(String[] args) {
		
	Voter v1=new Voter(04);
	v1.validiate();
	catch (VoterAgeException m1)
	{
		System.out.println(m1);
	}
}
