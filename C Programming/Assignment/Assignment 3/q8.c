//strong Number 
#include<stdio.h>
void  main() 
{
    int num;
	printf("Enter any Number : ");      //145
	scanf("%d",&num); 
    int temp = num, sum = 0;

    while (temp > 0) 
	{
        int num = temp % 10;
    
        int fact = 1, i = 1;
        while (i <=num) 
	{
            fact =fact* i;
            i++;
        }
		
        sum =sum+ fact;
        temp =temp/ 10;
   	}

    if (sum == num)
        printf("Strong");
    else
        printf("Not Strong");

}
