//8. Merge two arrays 
#include<stdio.h>
void merge(int arr1[],int arr2[],int merged[],int n);
void main() 
{
    int n;
    printf("Enter size of arrays : ");
    scanf("%d", &n);

    int arr1[n], arr2[n], merged[2*n];

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
    merge(arr1,arr2,merged,n);
        merge(arr1,arr2,merged,n);

}
void merge(int arr1[],int arr2[],int merged[],int n)
{
for (int i = 0; i < n; i++) 
    {
        merged[i] = arr1[i];
    }


    for (int i = 0; i < n; i++) 
    {
        merged[n + i] = arr2[i];
    }


    printf("\nMerged Array : [ ");
    for (int i = 0; i < 2 * n; i++) 
    {
        printf("%d,", merged[i]);
    }
    printf("\b ]\n");
}