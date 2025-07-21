#include <stdio.h>
#include <string.h>
void main ()
{
	char str1[20],str2[20];
	printf("Enter String of str1 : ");
	gets(str1);
	printf("Enter String of str2 : ");
	gets(str2);

	// 7. strncmp
    printf("Compare first 5 chars of str1 and str2: %d\n", strncmp(str1, str2, 5));
}