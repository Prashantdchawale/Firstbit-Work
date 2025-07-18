//1. Find minimum and maximum number in array.  
#include<stdio.h>
void main ()
{	
    int n;
	printf("Enter size of an array : ");
	scanf("%d",&n);
	
	int arr[n];	
	printf("\nEnter Array elements   : ");
	for(int i=0; i<n; i++)
	scanf("%d",&arr[i]);

	printf("\nYour Entered Elements in Array : ");
	printf("[");
	for(int i=0;i<n;i++)
	{
	printf("%d,",arr[i]);
	}
	printf("\b]\n\n");

	
	int min=arr[0];
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]<=min)
		min=arr[i];
	}
	printf("Minimum Element in Array : %d ",min);
	
	
	
	int max=arr[0];
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]>=max)
		max=arr[i];
	}
	
	printf("\nMaximum Element in Array : %d ",max);

}
