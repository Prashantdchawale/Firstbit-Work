#include <stdio.h>
void main ()
{
	int start,end;
	printf("Enter Starting Number : ");
	scanf("%d",&start);
 	printf("Enter ending Number   : ");
	scanf("%d",&end);
	int i=start;
	while (i<=end)
	{
		printf("%d\n",i);    
		i++;
	}
}	
