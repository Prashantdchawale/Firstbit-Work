//Write a program to check the string is palindrome or not. 
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	int count=0,i=0,ispalindrome=1;
	
	printf("Enter String :");
	gets(str);
	
	for(i=0;str[i]!='\0';i++)
	{
		count++;
	}
	
	for(i=0;i<count/2;i++)
	{
		if(str[i]!=str[count-1-i])
		
		{
			ispalindrome=0;
			break;
		}

	}
	if(ispalindrome)
		printf("The string is Palindrome .\n");
	else
		printf("The string is not a palindrome.\n");
}