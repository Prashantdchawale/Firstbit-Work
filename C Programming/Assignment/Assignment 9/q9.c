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
    char* pos = strchr(str1, ch);


    // 9. strrchr
    pos = strrchr(str1, ch);
    if (pos)
        printf("Last occurrence of '%c' in str1 at position: %ld\n", ch, pos - str1);
}
