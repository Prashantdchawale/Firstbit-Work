//3. Print perfect numbers in the given range 1 to n. 
#include<stdio.h>
void  main() 
{
    int n;

    printf("Enter the end for perfect numbers: ");
    scanf("%d", &n);

    printf("Perfect numbers between 1 and %d are:\n", n);

    for (int i = 2; i <= n; i++) 
    { 
		int sum=0;
	    for (int j = 1; j <= i/2 ; j++) 
        {
            if (i % j == 0) 
                sum = sum + j;
        }

        if (sum == i)
            printf("%d ", i);
    }

}
