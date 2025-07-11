// palindrome number 
int palindrome();
void main()
{
	int res=palindrome();
	if(res==0)
	printf("palindrome number");
	else
	printf("not palindrome number");

	
}
int palindrome()
{
	int no=515;
	int r1,r2,r3,q1,rev;
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
		return 0;
	}
	else
		return 1;
}