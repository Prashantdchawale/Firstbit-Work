void main()
{
	printf("Press 1 To check number is even or odd \n2 To check number is prime or not\n");
	printf("3.To check number is pallindrome or not\n4 To check number is positive, negative or zero");
	printf("\n5.To reverse a number \n6 To find sum of digits\n\n");
	int num;
	printf("Enter Choice i among  operations:");
	scanf("%d",& num);
	if(num==1)
	{
			int no;
			printf("Enter the number");
			scanf("%d",&no);
				if(no%2==0)
					printf("even");
				else
					printf("odd");	
	}
	else if(num==2)
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
	else if(num==3)
	{
		    int n;
		    printf("Enter a number to check Palindrome :");
		    scanf("%d",&n);
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
	else if(num==4)
	{
			int no;
			printf("Enter to check +,-ve, o number : ");
			scanf("%d",&no);
			if(no>0)
				printf("It is positive number");
			else if (no<0)
				printf("It is Negative number ");
			else if(no==0)
				printf(" zero number");
	}
	else if(num==5)
	{
			int no;
			printf("Enter a number to reverse : ");
			scanf("%d",&no);
			int r1,r2,r3;
			int q1,rev;
			r1=no%10;
			q1=no/10;
			r2=q1%10;
			r3=q1/10;
			rev=r1*100+r2*10+r3;
			printf("%d\n",rev);
	}
	else if(num==6)
	{
			int number, sum = 0;
		    printf("Enter an number of sum of numbers : ");
		    scanf("%d", &number);
	if (number < 0)
		    number = number-number;
		    for (; number != 0; number=number/ 10)
		    sum =sum+ number % 10;
		    printf("Sum of digits: %d\n", sum);
	}
	else
			printf("enter vaild input");
}