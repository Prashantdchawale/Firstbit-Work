import java.util.Scanner;
class Search
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Number to Seach : ");
        int no=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==no)
            {
                System.out.println("Number "+no+" found");
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Number "+no+" not found in Array");
        }
    }
}

