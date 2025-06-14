//2. Print prime numbers in the given range 1 to n. 
void  main() 
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Prime numbers between 1 and %d are:\n", n);

    for (int i = 1; i <= n; i++) 
	{
        int isPrime = 1;

        for (int j = 2; j <= i / 2; j++) 
            if (i % j == 0) 
			{
                isPrime = 0;
                break;
            }
        if (isPrime)
            printf("%d ", i);   
    }
}
