//Admin (id, name, salary, allowance)
 
 #include<stdio.h>
 typedef struct admin
 {
 	int id;
 	char name[20];
 	int salary;
 	int allowance;
 }admin;
 
admin storeadmin();
void displayadmin(admin e1);

void main ()
 {
 
	admin e1,e2,e3;
	
	printf ("Enter Details of e1 : ");	
	e1=storeadmin();
	
	printf ("\nEnter Details of e2 : ");
	e2=storeadmin();
	
	printf ("\nEnter Details of e3 : ");
	e3=storeadmin();

	displayadmin(e1);
	displayadmin (e2);
	displayadmin (e3);

}
admin storeadmin()
{
		admin e1;
		scanf("%d %s %d %d",&e1.id ,&e1.name ,&e1.salary ,&e1.allowance);
    	return e1;
}
void  displayadmin (admin e1)
{
		printf("\nId=%d Name=%s Salary=%d Allowance=%d",e1.id,e1.name,e1.salary,e1.allowance);
}
