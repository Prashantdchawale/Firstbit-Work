#include <stdio.h>
void main()
{
    int start = 1, end = 5, sum = 0;
    int i = start;

    while (i <= end) 
	{
        sum = sum+i;
        i++;
    }

    printf("Sum from %d to %d is: %d\n", start, end, sum);
    
}