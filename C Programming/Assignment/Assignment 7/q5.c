//4. Find odd and even among the numbers.  
#include<stdio.h>
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
	
	printf("\nAlternate elements in Array    : [");
	for(int i=0;i<n;i=i+2)
	{
	printf("%d,",arr[i]);
	}
	printf("\b]\n\n");
}