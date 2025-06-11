
void main()
{
	
    int n;
    printf("Enter a number to check prime or not:");
    scanf("%d",&n);
    int i = 2,count = 0;

    while (i < n) 
	{
        if (n % i == 0) 
		{
            count++;
            break;
        }
        i++;
    }

    if (count == 0 && n > 1)
        printf("Prime");
    else
        printf("Not Prime");

	
}