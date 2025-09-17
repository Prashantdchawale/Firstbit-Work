import java.util.Scanner;
class CrrAdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Arrays : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[n];
        int[] crr = new int[n];

        System.out.println("Enter " +n+ " elements for arr array : ");
        for (int i=0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements brr second array : ");
        for (int i=0;i<n;i++) 
        {
            brr[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) 
        {
            crr[i] = arr[i]+brr[i];
        }

        System.out.print("Final crr Array is : ");
        for (int i=0;i<n;i++) 
        {
            System.out.print(crr[i]+" ");
        }
    }
}
