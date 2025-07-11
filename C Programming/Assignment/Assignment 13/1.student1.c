//Student (rollNo, name, marks) 
 #include<stdio.h>
 
 typedef struct student
 {
 	int rollno;
 	char name[20];
 	int marks;
 }student;
 
 typedef struct datedob
 {
 	int day,month,year;
 }date;
 
 
void storeStudent(student* s1);
void  displaystudent (student* s1);

void main ()
 {
 
	student s1,s2,s3;
	
	printf ("Enter Details of S1 : ");	
	storeStudent(&s1);
	
	/*printf ("\nEnter Details of S2 : ");
	storeStudent(&s2);
	
	printf ("\nEnter Details of S3 : ");
	storeStudent(&s3);*/

	displaystudent (&s1);
//	displaystudent (&s2);
//	displaystudent (&s3);

}
void storeStudent(student* s1)
{
	
		scanf("%d %s %d",&s1->rollno,&s1->name,&s1->marks );
    	
}
void  displaystudent (student* s1)
{
		printf("\nRollno=%d Name=%s Marks=%d",s1->rollno,s1->name,s1->marks);
}
