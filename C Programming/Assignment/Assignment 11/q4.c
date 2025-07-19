//WAP to Form a New String where the First Character and the Last Character have been Exchanged.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[25];
	int len;
	char temp;
	
	printf("Enter a string :");
	scanf("%s",str);
	
	len=strlen(str);
	printf("%d",len);
	
	if(len>1)
	{
		temp=str[0];
		str[0]=str[len-1];
		str[len-1]=temp;
	}
	printf("\nNew string after swapping first and last character : %s",str);
}