#include <stdio.h>
void  main()
{
    int num;
	printf("Enter any Number : ") 
    int firstdigi, lastdigt, sum=0;

    lastdigit = num % 10; 

    firstdigit = num;
    while (firstdigit >= 10) 
	{
        firstdigit =firstdigit / 10; 
		
	}
    sum = firstdigit + lastdigit;
    printf("Sum of first and last digit: %d", sum);

}
