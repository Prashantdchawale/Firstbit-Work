import java.util.Scanner;
class Merge
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays : ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int merged[] = new int[2 * n];

        System.out.println("\nEnter elements of arr1 : ");
        for (int i=0; i<n; i++) 
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("\nEnter elements of arr2 : ");
        for (int i=0; i<n; i++) 
        {
            arr2[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) 
        {
            merged[i] = arr1[i];
        }

        for (int i=0; i<n; i++) 
        {
            merged[n+i] = arr2[i];
        }

        System.out.print("\nMerged Array : [ ");
        for (int i=0; i<2*n; i++) 
        {
            System.out.print(merged[i] + ",");
        }
        System.out.println("\b ]");
    }
}