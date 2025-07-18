//1. Find minimum and maximum number in array.  
#include<stdio.h>

int maximum(int[], int);
int minimum(int[], int);

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
	
    int max = maximum(arr, n);
    printf("\nMaximum Element in Array : %d ",max);
    
	int min = minimum(arr, n);    
	printf("\nMinimum Element in Array : %d ",min);

}
int minimum(int arr[],int size)
{
	int min=arr[0];
	
	for(int i=0;i<size;i++)
	{
		if(arr[i]<=min)
		min=arr[i];
	}
	return min;
}

int maximum(int arr[],int size)
{
	int max=arr[0];
	
	for(int i=0;i<size;i++)
	{
		if(arr[i]>=max)
		max=arr[i];
	}
	return max;
}
