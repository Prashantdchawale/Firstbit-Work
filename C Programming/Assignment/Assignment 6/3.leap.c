int leap();
void main()
{
	int year;
	int res=leap();
	if (res==0)
	printf("The Given is leap year");
	else
	printf("The Given Year is Not leap year");




}
int leap()
	{
	int year;
	printf("Enter Year : ",year);
	scanf("%d",&year);
		if(year%4==0 && year%100 !=0 || year%400 ==0)
		return 0;
	else
		return 1;

	return year;
	
	}



