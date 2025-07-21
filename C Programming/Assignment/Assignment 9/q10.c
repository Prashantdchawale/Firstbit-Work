#include <stdio.h>
#include <string.h>

void main()
{
    char str1[100] = "Hello World";
    char* pos;

    // strstr
    pos = strstr(str1, "World");
    if (pos)
        printf("Found 'World' in str1 at position: %ld\n", pos - str1);
    else
        printf("'World' not found in str1\n");
}
