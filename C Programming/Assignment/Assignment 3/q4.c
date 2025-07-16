#include<stdio.h>
void main()
{
	
    int num;
    printf("Enter a number to check prime or not:");
    scanf("%d",&num);
    
    int i = 2, flag=0;

    while (i < num) 
	{
        if (num % i == 0) 
		{
            flag=1;
            break;
        }
        i++;
    }

    if (flag == 0 && num > 1)
        printf("Prime");
    else
        printf("Not Prime");
}
