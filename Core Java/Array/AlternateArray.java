import java.util.Scanner;
class AlternateArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements : ");
        for (int i=0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Alternate elements of the array are : ");
        for (int i=0;i<n;i = i+2) 
        {
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nAlternate elements of the array are : ");
        for (int i=1;i<n;i = i+2) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
