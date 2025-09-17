import util.java.Scanner;
class MinMaxArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] arr={25, 10, 45, 5, 60, 15};
        int min=arr[0];
        int max=arr[0];

        for (int i=1;i<arr.length;i++) 
        {
            if(arr[i]<min) 
            {
                min=arr[i];
            }

            if(arr[i]>max) 
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum number="+min);
        System.out.println("Maximum number="+max);
    }
}
