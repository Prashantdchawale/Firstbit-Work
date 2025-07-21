#include <stdio.h>
#include <string.h>

void main()
{
	char str [50];
	printf("Enter string here : ");
	gets(str);
	char temp[50];
	
	// memcpy
    memcpy(temp, str, strlen(str) + 1);
    printf("memcpy result: '%s'\n", temp);
}