void main()
{
	int price,total;
	char res;
	printf("Enter price:");
	scanf("%d",&price);
	
	printf("if your student then send y or n :");
	scanf(" %c",&res);
	
	if(price>500 && res=='y')
	{
		total=price-(price*0.20);
		printf("your discount is %d",total);
	}
	 else if(price<500 && res=='y')
	{
		total=price-(price*0.10);
		printf("your discount is %d",total);
	}
	else if(price>600 && res=='n')
	{
		total=price-(price*0.15);
		printf("your discount  15 is %d", total);
	}
	else
		printf("your not eligible");
}