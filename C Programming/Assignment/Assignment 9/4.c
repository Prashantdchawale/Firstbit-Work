#include <stdio.h>
#include <string.h>
void main ()
{
	char str[20];
	printf("Enter String : ");
	gets(str);
	
    strcat(str," Welcome!");
    printf("After strcat: '%s'\n", str);



}