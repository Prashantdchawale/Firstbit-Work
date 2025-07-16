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
        int digit = temp % 10;
    
        int fact = 1; 
       		for(int i=1;i<=digit;i++)
		{
         		fact =fact* i;
        	}
		
	sum =sum+ fact;
	temp =temp/ 10;
   	}

    if (sum == num)
        printf("Strong");
    else
        printf("Not Strong");

}
