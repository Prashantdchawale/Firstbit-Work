#include <stdio.h>
#include <string.h>

void main()
{
    // 11. strtok
    char str[100] = "C,is,a,programming,language";
    char* token = strtok(str, ",");

    printf("Tokens:\n");
    while (token != NULL) 
	{
        printf("  %s\n", token);
        token = strtok(NULL, ",");
    }
}
