#include <stdio.h>
#include <string.h>

void  main() 
{	
	// strpbrk
	char str1[50];
	printf("Enter string : ");
	gets(str1);
    char* found = strpbrk(str1, "aeiou");
    if (found)
        printf("First vowel in str1: %c\n", *found);
}