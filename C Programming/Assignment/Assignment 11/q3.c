#include <stdio.h>
#include <string.h>

void main()
{
    char str[25];
    int index;

    printf("Enter a string       : ");
	gets(str);

    printf("Enter index to remove: ");
    scanf("%d", &index);

    printf("\nBefore removal : %s\n", str);

    for (int i = index; str[i]!='\0'; i++)
	{
        str[i] = str[i + 1];
    }

    printf("After removal  : %s\n", str);
}
