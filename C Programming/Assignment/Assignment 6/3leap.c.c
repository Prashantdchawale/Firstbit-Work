void leap();
void main()
{
	leap();
}
void leap()
	{
	int year;
	printf("Enter Year : ",year);
	scanf("%d",&year);
	if(year%4==0 && year%100 !=0 || year%400 ==0)
		printf("The Given is leap year");
	else
		printf("The Given Year is Not leap year");
	}



