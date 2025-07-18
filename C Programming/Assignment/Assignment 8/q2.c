//2. Search the given number in array.  
#include<stdio.h>
int findInArray(int arr[],int size);

void main ()
{	
	int n;
	printf("Enter range of array : ");
	scanf("%d",&n);
	int arr[n];
	printf("Enter Array elements : ");
	for(int i=0; i<n; i++)
	scanf("%d",&arr[i]);

	printf("[");
	for(int i=0;i<n;i++)
	{
	printf("%d,",arr[i]);
	}
	printf("\b]\n\n");
	
	int x=findInArray(arr,n);
}

int findInArray(int arr[],int size)
{
	printf("Enter element to find in array : ");
	int ele,found=0;
	scanf("%d",&ele);
	for(int i=0;i<size;i++)
	{
		if(ele==arr[i])
		{
		printf("Searched element found at  : [%d] index",i);
		found=1;
		break;
		}
	}
	if(!found)
	printf("You searched element not found in this Array");
	return 1;
}
	
	

	
	
