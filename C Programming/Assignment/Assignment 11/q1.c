//1.Write a program to scan string from user then scan a single character and search it in a accepted string.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	char ch, found=0;
	
	printf("Enter string :");
    gets(str);	
	printf("enter a single character to find a inside the string :");
	scanf(" %c",&ch);
	
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==ch)
		{
			found=1;
			printf("\nCharacter '%c' found at position : %d\n", ch, i);
			break;
		}
		i++;
}
	if(!found)
	printf("Character '%c' not found in the string.\n", ch);
}