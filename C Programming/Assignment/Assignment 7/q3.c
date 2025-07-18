//3. Find sum of all numbers.  
void main ()
{
	int n;
	printf("Enter range of array : ");
	scanf("%d",&n);
	
	int arr[n];
	printf("\nEnter Array elements : ");
	for(int i=0; i<n; i++)
	scanf("%d",&arr[i]);

	printf("\nYour Entered Elements in Array : ");
	printf("[");
	for(int i=0;i<n;i++)
	{
	printf("%d,",arr[i]);
	}
	printf("\b]\n\n");
	
	int sum=0;
	for(int i=0;i<n;i++)
	sum =sum + arr[i];
	printf("Sum of all Elements in an Array : %d",sum);
}