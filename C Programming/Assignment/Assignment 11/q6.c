//WAP to Take in a String and Replace Every Blank Space with special symbol. 
#include <stdio.h>
#include<string.h>
void main()
{
    char str[20];
    int i;
	char modifiedString;

    printf("Enter a string : ");
    gets(str);  
    
    printf("ModifiedString Which You Want to Add : ");
	scanf("%c",&modifiedString);

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ' ')
        {
            str[i] = modifiedString;
        }
    }

    printf("\nModified string using special symbol :  %s\n", str);
}