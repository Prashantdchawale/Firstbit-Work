import java.util.Scanner;
class Sorted2ndArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements : ");
        for (int i=0; i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<n-1;i++) 
        {
            for (int j=0;j<n-i-1;j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp =arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array is : ");
        for (int i=0;i<n;i++) 
        {
            System.out.print(arr[i] + " ");
        }

        if (n > 1) 
        {
            System.out.println("\n"+"Second Maximum Element is : "+arr[n-2]);
        } 
        else
        {
            System.out.println("There is only one number in the array.");
        }
    }
}
