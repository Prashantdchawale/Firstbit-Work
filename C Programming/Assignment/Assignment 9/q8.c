#include <stdio.h>
#include <string.h>
void main ()
{
	char str1[20],str2[20];
	printf("Enter String of str1 : ");
	gets(str1);
	printf("Enter String of str2 : ");
	gets(str2);
    char ch = 'o';
	
	 // 8. strchr
    char* pos = strchr(str1, ch);
    if (pos)
        printf("First occurrence of '%c' in str1 at position: %ld\n", ch, pos - str1);
    else
        printf("Character not found\n");
}