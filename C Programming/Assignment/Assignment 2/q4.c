void main ()
{
	int marks;
	printf("Enter marks : ");
	scanf("%d",&marks);
	
	if (marks>=80)
		printf("A+ with Distinction");
		
	else if(marks>=65)
		printf("First Class");
		
	else if(marks>=55)
		printf("Second Class");
		
	else if(marks>=40)
		printf("Pass");
		
	else 
	printf("Fail");	
}