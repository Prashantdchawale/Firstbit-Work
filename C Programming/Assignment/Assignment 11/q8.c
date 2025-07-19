//WAP to Calculate the Number of Words Present in a String 
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	int count=0;
	int i=0;
	printf("Enter a string : ");
	gets(str);
	
	
	while(str[i]!='\0')
	{
		if ((str[i] != ' ' && str[i] != '\n') &&
        (str[i + 1] == ' ' || str[i + 1] == '\0' || str[i + 1] == '\n')) 
		
		count++;
		i++;
	}
	

	printf("Number of words present in string is %d",count);
} 