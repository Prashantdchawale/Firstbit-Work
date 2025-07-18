//6. Accept array and print only prime numbers of array.  
#include<stdio.h>
prime(int[],int);
void main ()
{
	int n;
	printf("Enter range of array : ");
	scanf("%d",&n);
	
	int arr[n];
	printf("\nEnter Array elements : ");
	for(int i=0; i<n; i++)
	scanf("%d",&arr[i]);
	
	prime(arr,n);
	
}


prime(int arr[], int n)
{
    printf("\nPrime numbers in the array: [");
    int found = 0;

    for (int i = 0; i < n; i++)
	{
        int isPrime = 1;

        if (arr[i] < 2)
            continue;

        for (int j = 2; j <= arr[i]/2; j++)
		{
            if (arr[i] % j == 0) 
			{
                isPrime = 0;
                break;
            }
        }

        if (isPrime)
		{
            printf("%d,",arr[i]);
            found = 1;
        }
    }

    if (found)
        printf("\b]\n");
    else
        printf("\nNO ANY PRIME NUMBER IN AN ARRAY ]\n");
}
