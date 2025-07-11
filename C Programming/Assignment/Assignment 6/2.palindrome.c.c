// palindrome number 
void palindrome();
void main()
{
	palindrome();
}
void palindrome()
{
	int no=515;
	int q1,rev;
		printf("%d\n",no);
	{
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
		printf("%d\n",rev);
	}
	
	if(rev==no)
	{
		printf("palindrome number");
	
	}
	else
	{
		printf("not palindrome number");
	}
}