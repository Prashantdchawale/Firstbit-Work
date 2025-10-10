import java.util.*;
class ArrayTest
{
	public static void main(String[] args)
	{
		//ArrayList a1=new ArrayList();
		LinkedList a1=new LinkedList();
			a1.add(10);
			a1.add(30);
			a1.add(30);		 	//Duplicate Value
			a1.add(30);	  		//Duplicate Value
			a1.add(20);
			a1.add(40);
			//a1.add(40);
			
			System.out.println(a1);
			
			System.out.println(a1.get(2));
			//System.out.println(a1.get(5));
			System.out.println(a1.get(0));

	}
}
