//to check given age of person is eligible for vote or not
int vote();
void main()
{
	int res = vote();
	if (res==1)
		printf("your are eligible for  vote");
	else
		printf("your are not eligible for vote");
}
int vote()
{
	int age;
	printf("Enter Your Age : ",age);
	scanf("%d",&age);
	if(age>=18)
	{
	return 1;
	}
	else
	{
	return 0;
	}
}