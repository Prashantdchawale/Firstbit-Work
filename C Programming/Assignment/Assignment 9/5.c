#include <stdio.h>
#include <string.h>
void main ()
{
	char str[20];
	printf("Enter String : ");
	gets(str);
	
    strncat(str, "12345", 3);		// 5. strncat
    printf("After strncat: '%s'\n", str);
}