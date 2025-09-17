import java.util.Scanner;
class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);

		int [] arr= new int[n];


		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a value:");
			arr[i]=sc.nextInt();
			
		}
			int max = arr[0];
        	int min = arr[0];	

   		for (int i = 1; i < arr.length; i++) 
		{
        	if (arr[i] > max)
           	max = arr[i];

       		if (arr[i] < min)
           	min = arr[i];
    	}
  		System.out.println("Maximum No:"+max);
  		System.out.println("Minimum No:"+min);
	}
}
