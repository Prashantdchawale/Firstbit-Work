//SalesManager (id, name, salary, incentive, target) 
 
 #include<stdio.h>
 typedef struct salesmanager
 {
 	int id;
 	char name[20];
 	int salary;
 	int incentive;
 	int target;
 	
 }salesmanager;
 
salesmanager storesalesmanager();
void displaysalesmanager(salesmanager e1);

void main ()
 {
 
	salesmanager e1,e2,e3;
	
	printf ("Enter Details of e1 : ");	
	e1=storesalesmanager();
	
	printf ("\nEnter Details of e2 : ");
	e2=storesalesmanager();
	
	printf ("\nEnter Details of e3 : ");
	e3=storesalesmanager();
	displaysalesmanager(e1);
	displaysalesmanager(e2);
	displaysalesmanager(e3);

}
salesmanager storesalesmanager()
{
		salesmanager e1;
		scanf("%d %s %d %f %d",&e1.id ,&e1.name ,&e1.salary ,&e1.incentive ,&e1.target );
    	return e1;
}
void  displaysalesmanager (salesmanager e1)
{
		printf("\nId=%d Name=%s Salary=%d Incentive=%f Target=%d",e1.id,e1.name,e1.salary,e1.incentive,e1.target );
}
