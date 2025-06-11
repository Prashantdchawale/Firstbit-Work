// to check given number is perfect number or not.
 
void main()
{
	int no=28,i=1,sum=0;
	while (i<no)
	{
		if (no%i==0)
		sum = sum+i;
		i++;
	}
    if (sum == no)
		printf ("No is Perfect");
	else
		printf ("No is Not Perfect");
}