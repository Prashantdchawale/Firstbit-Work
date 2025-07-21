#include <stdio.h>
#include <string.h>
void main ()
{
	char str[20];
	printf("Enter String : ");
	gets(str);
	
	char temp[50];
	
    strncpy(temp, str, 5);
    temp[20] = '\0'; // null-terminate manually
    printf("Copied first 5 chars of str : %s\n", temp);

}