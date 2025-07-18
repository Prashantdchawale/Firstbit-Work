// 7. Take two array and add sum in third array 
#include<stdio.h>
void sumincrr(int arr1[], int arr2[], int sum[], int n);
void main()
{
    int n;
    printf("Enter size of arrays : ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];

    printf("\nEnter elements of arr1 : \n");
    for (int i = 0; i < n; i++)
	{
        scanf("%d", &arr1[i]);
    }

    printf("\nEnter elements of arr2 : \n");
    for (int i = 0; i < n; i++) 
	{
        scanf("%d", &arr2[i]);
    }
    
	sumincrr(arr1,arr2,sum,n);
    
}

void sumincrr(int arr1[], int arr2[], int sum[], int n)
{
	for (int i = 0; i < n; i++) 
	{
        sum[i] = arr1[i] + arr2[i];
    }

    printf("\nSum of arr1 + arr2 : [");
    for (int i = 0; i < n; i++) 
	{
        printf("%d,", sum[i]);
    }
    printf("\b]\n");
}