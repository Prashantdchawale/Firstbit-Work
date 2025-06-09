#include <stdio.h>
void main ()
{
	int no1,no2,res;
	char op;
	
	printf("Perform arithmetic operater use any : (+, -, *, /, %%)\n");
	
	printf ("Enter First Number ");
	scanf ("%d",&no1);
	
	printf("Enter Second number ");
	scanf ("%d",&no2);
	
	printf("Enter choice among these operaters : (+, -, *, /, %%) \n");
	scanf(" %c",&op);
	
	printf("Your Entered Operation is : %c \n",op);
	
	if(op=='+')
	{
		res=no1+no2;
		printf("Addition of two number is : %d",res);
	}
	else if(op=='-')
	{
		res=no1-no2;
		printf("Substraction of two number is : %d",res);
	}
	else if(op=='*')
	{
		res=no1*no2;
		printf("Multiplication of two number is : %d",res);
	}
	else if(op=='/')
	{
		res=no1/no2;
		printf("Division of two number is : %d",res);
	}
	
}