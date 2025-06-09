void main()
{
	int num;
	printf("enter a number");
	scanf("%d", & num);
	
	if(num%3==0 &&   num%5==0)
		printf("divisible by 3 and 5");
	else if(num%3==0)
		printf("divisible by 3 not 5");
	else if(num%5==0)
		printf("divisible by 5 not 3");
	else
		printf("enter vaild number");
}