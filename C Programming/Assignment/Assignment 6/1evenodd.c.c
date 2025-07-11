//even odd 
//int evenodd();
void main()
{	
	int res=evenodd();
	if(res==0)
		printf("Given Number is even");
	else
	printf("Given Number is odd");


	
}
	void evenodd()
	{
	int no;
	printf("Enter Any Number : ");
	scanf ("%d",&no);
	
	if(no%2==0)
	{
		return 0;
	}
	else
		return 1;
	}
	