import java.util.System;
class Sum 
{
    public static void main(String[] args)
    {
        int [] arr={25, 10, 45, 5, 60, 15};
        int sum = 0;

        for (int i=0;i<arr.length;i++) 
        {
           sum=sum+arr[i];
        }
        System.out.println("Sum ="+sum);
    }
}
