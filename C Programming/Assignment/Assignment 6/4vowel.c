//to check character vowel or consonant 

#include <stdio.h>
char vowel();
void main()
{
	char res = vowel();
	if(res=='v')
	{
		printf("character is a vowel");
	}
	else if(res=='c')
	{
		printf("character is a consonant");
	}
	else if (res=='i')
	{
		printf("Enter Valid Character");
	}
}
char vowel()
{
	char ch;
		printf("Enter an alphabet : ");
		scanf("%c",&ch);
		
	if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
	{
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
   	
	{
	return 'v';
	}
    else 
   	{
    return 'c';
	}
	}
	else	
	{
	return 'i';
	}
}
	

	
