//3. Print perfect numbers in the given range 1 to n. 
void  main() 
{
    int n, i, j, res;

    printf("Enter the end for perfect number: ");
    scanf("%d", &n);

		for (i = 2; i <= n; i++)
	{
        res = 1;

        for (j = 2; j <= i / 2; j++) 
            if (i % j == 0) 
                res = 0;

        if (res) 
            printf("%d ", i);
    }
}