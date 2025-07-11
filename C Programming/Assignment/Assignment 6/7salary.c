// salary and discount program
int salary();
void main()
{
	int res=salary();
	return res;
}
int salary()
{
	float basic;
	printf("enter any amt of salary :");
	scanf("%f",&basic);
	
	float da,ta,hra,total;
	 
	 if(basic<=5000)
	 {
	 	da=basic*0.1;
	 	ta=basic*0.2;
	 	hra=basic*0.25;
	 	
	 }
	 else
	 {
	 	da=basic*0.15;
	 	ta=basic*0.25;
	 	hra=basic*0.3;
	 }
	 	
	 	total=da+ta+hra+basic;
	 	
	 	printf("Basic Salary %f\n",basic);
	 	printf("da is %f\n",da);
	 	printf("ta is %f\n",ta);
	 	printf("hra is %f\n",hra);
	 	printf("total is %f \n",total);
	 
	 return 0;
}