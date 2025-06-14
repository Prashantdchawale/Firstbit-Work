//4. Print strong numbers in the given range 1 to n. 
void  main()
{
    int n;
    printf("Enter the Last Number for strong number: ");
    scanf("%d", &n);

    for (int num = 1; num <= n; num++) {
        int temp = num;
        int sum = 0;

        while (temp > 0)
		 {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) 
                fact *= i;
           

            sum += fact;
            temp /= 10;
        }

        if (sum == num) 
            printf("%d ", num);  
    }
}