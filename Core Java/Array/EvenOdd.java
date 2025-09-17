import java.util.Scanner;
class EvenOdd
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n=sc.nextInt(); 

        int [] arr = new int [n];
        System.out.println("Enter Numbers Here : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Entered Numbers " +arr[i]+" is even");
            }
            else
            {
                System.out.println("Entered Numbers " +arr[i]+" is Odd");
            }
        }
    }
}