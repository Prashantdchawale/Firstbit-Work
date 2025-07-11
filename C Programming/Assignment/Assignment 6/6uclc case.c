//to check given character is UC or LC
char uclc();
void main()
{
	char res = uclc();
	if (res=='A')
	{
		printf("Character is a Uppercase letter\n");
	}
	else
	    printf("Character is a lowercase letter");

	
}
char uclc()
{
    char ch;
		printf("Enter a Character : ",ch);
		scanf("%c",&ch);
    if (ch>='A' && ch<='Z')
    {
    	return 'A';
    }
    else
    {
		return 'a';     
    }
}
