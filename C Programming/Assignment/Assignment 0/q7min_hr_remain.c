void main ()
{
	int min;
		printf("Enter any Minutes : ");
		scanf("%d",&min);
	int hr,remain;
	hr=min/60;
	remain=min%60;
	printf("Given minutes are: %d\n",min);
	printf("Given Hrs are: %d\n",hr);
	printf("Remaining minutes are: %d\n",remain);
}