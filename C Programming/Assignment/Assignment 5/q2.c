//2. Print a right-angled triangle pattern      (Input: n = 5) 
void main ()
{
	int n=5;
	for(int i=1; i<=n; i++)
	{         
        for (int j = 0; j < i; j++)      
            printf("*  ");                     
        	printf("\n");                    
    }
}