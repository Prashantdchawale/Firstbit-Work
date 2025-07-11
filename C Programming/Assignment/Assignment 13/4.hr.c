//HR (id, name, salary, commission) 
 
 #include<stdio.h>
 typedef struct hr
 {
 	int id;
 	char name[20];
 	int salary;
 	int commission;
 	
 }hr;
 
void displayhr(hr e1);

void main ()
 {
 
	hr e1,e2,e3;
	
	printf ("Enter Details of e1 : ");	
	e1=storehr();
	
	printf ("\nEnter Details of e2 : ");
	e2=storehr();
	
	printf ("\nEnter Details of e3 : ");
	e3=storehr();
	
	displayhr(e1);
	displayhr(e2);
	displayhr(e3);
}

hr storehr()
{
		hr e1;
		scanf("%d %s %d",&e1.id ,&e1.name ,&e1.salary ,&e1.commission);
    	return e1;
}
void  displayhr (hr e1)
{
		printf("\nId=%d Name=%s Salary=%d Commission=%d",e1.id,e1.name,e1.salary,e1.commission);
}
