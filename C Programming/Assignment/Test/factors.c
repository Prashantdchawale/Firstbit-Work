// to print factors of number in given range 10-15
#include<stdio.h>
#include<string.h>
void main () {
	int start,end;
	printf("Starting No From : ",start);
	scanf("%d",&start);
	printf("Ending Number    : ",end);
	scanf("%d",&end);
	int i;
	for(i=start; i<=end; i++) {
		printf("%d=",i);
		for(int j=1; j<=i; j++) {
			if(i%j==0)
				printf("%d,",j);
		}
		printf("\n");
	}		printf("\n");

}