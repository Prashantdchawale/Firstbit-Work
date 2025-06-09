void main()
{
	int a,b,c;
	printf("Enter sides of triangle \n");
	
	printf("Enter First Side: ");
	scanf("%d",&a);
	
	printf("Enter Second Side: ");
	scanf("%d",&b);
	
	printf("Enter third Side: ");
	scanf("%d",&c);
	
	if (a==b&&b==c)
		printf("Equilateral Triangle");
	
	else if (a==b||b==c||a==c)
		printf("Isosceles Triangle");
	else
		printf("Scelen Traingle");
	}
