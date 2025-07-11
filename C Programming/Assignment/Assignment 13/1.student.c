//Student (rollNo, name, marks) 
 #include<stdio.h>
 typedef struct student
 {
 	int rollno;
 	char name[20];
 	int marks;
 }student;
student storeStudent(student* s1)
displaystudent (student &s1)

void main ()
 {
 
	student s1;
	
	printf ("Enter Details of S1 : ");	
	storeStudent(&s1)
	displaystudent(&s1)


}
student storeStudent()
{
		student *s1;
		scanf("%d %s %d",&s1->rollno ,&s1->name ,&s1->marks );
    	
}
displaystudent (student *s1)
{
		printf("\nRollno=%d Name=%s Marks=%d",s1->rollno,s1->name,s1->marks);
}
