void main ()
{
	int age;
	printf("Enter age : ");
	scanf("%d",&age);
	if (age>=60)
		printf("Senior");
	else if(age<12)
		printf("Child");
	else if(age>12 && age<19)
		printf("Teenager");
	else if(age>20 && age<60)
		printf("Adult");
	else 
	printf("Enter valid Number : ");	
}