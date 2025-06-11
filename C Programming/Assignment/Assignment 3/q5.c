
void main()
 {
    int n = 153;
    int original = n;
    int sum = 0, digit;

    while (n != 0) 
	{
        digit = n % 10;         
        sum =sum+ digit * digit * digit;  
        n /= 10;              
    }

    if (sum == original)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");

    
}