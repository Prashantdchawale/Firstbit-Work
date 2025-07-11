//Employee (id, name, salary) 
#include <stdio.h>

typedef struct employee 
{
    int id;
    char name[20];
    int salary;
} employee;

employee storeemployee();
void displayemployee(employee);

void main() 
{
    employee e1, e2, e3;

    printf("Enter Details of Employee 1:\n");
    e1 = storeemployee();

    printf("\nEnter Details of Employee 2:\n");
    e2 = storeemployee();

    printf("\nEnter Details of Employee 3:\n");
    e3 = storeemployee();

    printf("\nEmployee Details \n");
    displayemployee(e1);
    displayemployee(e2);
    displayemployee(e3);
}


employee storeemployee()
 {
    employee e1;
    printf("Enter ID, Name, Salary: ");
    scanf("%d %s %d", &e1.id, e1.name, &e1.salary);
    return e1;
}


void displayemployee(employee e1)
{
    printf("Id=%d, Name=%s, Salary=%d\n",e1.id,e1.name,e1.salary);
}