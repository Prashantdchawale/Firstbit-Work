#include <stdio.h>
#include <string.h>

void main()
{
    char str[] = "reverse";
    int len = strlen(str);
    for (int i = 0; i < len/2; i++) 
	{
        char temp = str[i];
        str[i] = str[len-1-i];
        str[len-1-i] = temp;
    }
    printf("Reversed: %s\n", str);
}