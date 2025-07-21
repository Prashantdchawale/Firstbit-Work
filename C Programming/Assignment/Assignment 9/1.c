#include <stdio.h>
#include <string.h>
void main ()
{
	char str[20];
	printf("Enter String : ");
	gets(str);
	
	printf("Length of string is : %lu\n", strlen(str));
}