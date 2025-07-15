//armstrong Number
#include<stdio.h>
#include<math.h>
void main()
	{
    int num;
    printf ("Enter any Number : ");
    scanf("%d",&num);
	int sum = 0, digit=0, count=0;
	int original = num;

    
    int temp=num;
    while(temp!=0)
	{
    	count++;
		temp=temp/10;
	}
	temp=num;
    while(temp!=0)
	{
        digit = temp % 10;         			
        sum = sum + pow(digit,count);  
        temp = temp/10;              
    }
    if (sum == original)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");
	}
