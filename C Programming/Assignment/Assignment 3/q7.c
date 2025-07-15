//factorial
#include<stdio.h>
void  main() 
{
    int num;
    printf("Enter any Number : ");
    scanf("%d",&num);
    printf("%d! = ",num);
    int fact = 1;
    int i = 1;

    
    while( i <= num) 
	{
        fact =fact* i;
         i++;
	}
    printf("%d\n", fact);
}
