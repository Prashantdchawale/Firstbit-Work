import java.util.Scanner;

class Prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int found=0;
        System.out.print("Prime Elements are : ");
        for (int i=0;i<n;i++) 
        {
            int isPrime=1;

            if (arr[i]<2)
            continue;

            for(int j=2;j<=arr[i]/2;j++) 
            {
                if (arr[i] % j ==0) 
                {
                    isPrime=0;
                    break;
                }
            }
            if (isPrime==1) 
            {
                System.out.print(arr[i]+ " ");
                found = 1;
            }
            
        }
        if (found==0) 
        {
            System.out.println("No Any Prime Element.");
        }
    }
}
