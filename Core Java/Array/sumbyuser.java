import java.util.Scanner;
class Sum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n=sc.nextInt();


        int arr [] = new int[n]; 
        int sum = 0;

        System.out.println("Enter Numbers Here  :");

        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}