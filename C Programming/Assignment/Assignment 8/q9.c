//9. Reverse the given array. 
#include<stdio.h>
reverse(int [], int);
void main() 
{
    int n;
    printf("Enter size of Array : ");
    scanf("%d", &n);

    int arr[n],	rev[n];
    printf("\nEnter elements of arr : \n");
    for (int i = 0; i < n; i++)
	{
        scanf("%d", &arr[i]);
    }
    
    printf("\nYour Entered elements in arr : [");
    for (int i = 0; i < n; i++)
    {
    printf("%d,",arr[i]);
	}
	printf("\b]");
	
	reverse(arr,n);
}

reverse(int arr[], int n)
{
	int rev[n];
	for (int i = 0; i < n; i++)       // to reverse
    {
    	rev[n - i - 1] = arr[i];	  // reverse logic
    }
	printf ("\n\nYour Reversed Array Elements : [");
	for (int i=0; i<n; i++)
	{
		printf("%d,",rev[i]);
	}
	printf("\b]");
}