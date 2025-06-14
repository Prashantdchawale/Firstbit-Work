//1. Print armstrong numbers in the given range 1 to n. 
void main() 
{
    int n = 2000;
    for (int i = 1; i <= n; i++) 
    {
        int num = i;
        int digits = 0;
        int temp;
        for (temp = num; temp > 0; temp = temp / 10)
           	 digits++;
        int sum = 0;

    for (temp = num; temp > 0; temp = temp / 10) 
        {
            int digit = temp % 10;
            int rem= 1;

            for (int j = 1; j <= digits; j++) 
            {
			
                rem =rem* digit;
			}
            sum =sum+rem;
    	}
        if (sum == num) 
            printf("Armstrong Number :%d\n ", num);
    }
}
