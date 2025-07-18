//10. Sort the array. 
#include <stdio.h>
void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i < n - 1; i++) 
    {
        for(int j = 0; j < n - 1 - i; j++) 
		{ 
            if(arr[j] > arr[j + 1]) 
			{ 
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("\nSorted array in ascending order : [");
    for(int i = 0; i < n; i++) {
        printf("%d,", arr[i]);
    }
    printf("\b]");
    
    
    for(int i = 0; i < n - 1; i++) 
    {
        for(int j = 0; j < n - 1 - i; j++) 
		{ 
            if(arr[j] < arr[j + 1]) 
			{ 
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("\n\nSorted array in Descending order: [");
    for(int i = 0; i < n; i++) {
        printf("%d,", arr[i]);
    }
    printf("\b]");
}