//WAP to Count the Number of Vowels in a String 
#include <stdio.h>
#include<string.h>
void main() 
{
    char str[25];
    int count = 0;

    printf("Enter a string : ");
    scanf("%s", str);

    for (int i = 0; str[i] != '\0'; i++)
	{
        if (str[i] == 'a' || str[i] == 'A' ||
            str[i] == 'e' || str[i] == 'E' ||
            str[i] == 'i' || str[i] == 'I' ||
            str[i] == 'o' || str[i] == 'O' ||
            str[i] == 'u' || str[i] == 'U')
			
            count++;
        
    }

    printf("Number of vowels: %d\n", count);
}
