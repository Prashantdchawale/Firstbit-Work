void  main()
 {
    int n = 12345; 
    int first, last,sum;

    last = n % 10; 

    first = n;
    while (first >= 10) 
	{
        first =first/ 10; 
		
	 }
    sum = first + last;
    printf("Sum of first and last digit: %d", sum);

}