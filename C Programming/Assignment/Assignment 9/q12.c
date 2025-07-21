#include <stdio.h>
#include <string.h>

void main()
{
    // memset

    char temp[11];
    memset(temp, '-', 10);    

    temp[10] = '\0';

    printf("memset result: '%s'\n", temp);
}
