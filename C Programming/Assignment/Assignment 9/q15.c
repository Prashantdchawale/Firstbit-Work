#include <stdio.h>
#include <string.h>

void  main() 
{	
	// memcmp
	char str1[100] = "Hello, World!";
    char str2[100] = "HELLO, world!";
    printf("memcmp between str1 and str2: %d\n", memcmp(str1, str2, 5));
}