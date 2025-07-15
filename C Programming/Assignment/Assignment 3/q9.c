//pallindrome
#include<stdio.h>
void main()
 {
	int num,reverse=0;
	printf("Enter any Number : ");    //121
	scanf("%d",&num);
		
	int temp=num;
   	while (temp > 0) 
	{
       	 int digit = temp % 10;
       	 reverse = reverse * 10 + digit;
       	 temp = temp / 10;
	}
    	if (num == reverse)
		printf("Pallindrome");
    	else
		printf("Not Pallindrome");
}
