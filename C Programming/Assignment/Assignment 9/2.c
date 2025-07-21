#include <stdio.h>
#include <string.h>
void main ()
{
	char str[20];
	printf("Enter String : ");
	gets(str);
	
	char temp[50];

    strcpy(temp, str);
    printf("Copied string to temp : '%s'\n", temp);
}