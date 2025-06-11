#include <stdio.h>
void main ()
{
	int i=1,res,table;
	printf ("Enter Table No Which You Want to Print : ");
	scanf("%d",&table);
	while (i<=10)
	{
		res=table*i;
		printf("%d*%d= %d\n",table,i,res);    
		i++;
	
	}
}	
