void  main() 
{
    int n = 145; 
    int temp = n, sum = 0;

    while (temp > 0) 
	{
        int no = temp % 10;
    
        int fact = 1, i = 1;
        while (i <=no) 
		{
            fact =fact* i;
            i++;
        }

        sum =sum+ fact;
        temp =temp/ 10;
    }

    if (sum == n)
        printf("Strong");
    else
        printf("Not Strong");

}