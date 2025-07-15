// to check given number is perfect number or not.
#include<stdio.h> 
void main()
{
	int num,sum=0;
	printf("Enter any Number : ");
	scanf("%d",&num);
	for (int i=1; i<num; i++)
	{
		if (num%i==0)
		sum = sum+i;
	}
    if (sum == num)
		printf ("No is Perfect");
	else
		printf ("No is Not Perfect");
}
