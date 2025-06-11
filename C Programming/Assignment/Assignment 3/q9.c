void main()
 {
    int n = 121; 
    int original = n, reverse = 0;

    while (n > 0) 
	{
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n =n/ 10;
    }

    if (original == reverse)
        printf("Palindrome");
    else
        printf("Not Palindrome");
}