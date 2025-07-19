//WAP to Take in Two Strings and Display the Larger String without Using Built-in Functions 
#include<stdio.h>
#include<string.h>
void main()
{
	char str1[20];
	char str2[20];
	int j=0;
	int i=0;
	
	printf("Enter first string:");
	gets(str1);
	
	printf("Enter Second String:");
	gets(str2);
	
	while(str1[i]!='\0')
	{
		i++;
	}
	while(str2[j]!='\0')
	{
		j++;
	}
	if(i>j)
		printf("Larger string is  %s\n",str1);
	else if(j>i)
		printf("Large String is %s  \n",str2);
	else
		printf("Both strings are of equal Length.\n");
	}