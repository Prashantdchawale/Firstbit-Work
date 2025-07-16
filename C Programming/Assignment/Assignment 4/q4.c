//4. Print strong numbers in the given range 1 to n. 
void  main()
{
    int n;
    printf("Enter the Last Number for strong number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        int temp = i;
        int sum = 0;

        while (temp > 0)
	{
            int digit = temp % 10;

            int fact = 1;
            for (int j = 1; j <= digit; j++) 
                fact = fact * j;
           

            sum = sum + fact ;
            temp = temp / 10;
        }

        if (sum == i) 
            printf("%d ", i );  
    }
}
