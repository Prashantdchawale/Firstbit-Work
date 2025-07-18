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
	
	printf("Even numbers in the array are  : [");
    for (int i = 0; i < n; i++) 
	{
        if (arr[i] % 2 == 0)
            printf("%d,", arr[i]);
    }
            printf("\b]");

    printf("\n\nOdd numbers in the array are   : [");
    for (int i = 0; i < n; i++)
	{
        if (arr[i] % 2 != 0)
            printf("%d,", arr[i]);
    }
            printf("\b]");
}
