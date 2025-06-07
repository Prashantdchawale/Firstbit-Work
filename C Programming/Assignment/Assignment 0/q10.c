void main ()
{
	int sub1,sub2,sub3,sub4,sub5;
	int TotalMarks;
	float per;
	sub1=75;
	sub2=60;
	sub3=67;
	sub4=50;
	sub5=50;
	TotalMarks =sub1+sub2+sub3+sub4+sub5;
	per=(TotalMarks/325.0)*100;
	//printf("Total Percentage :   %d\n",per);
	printf("Marks of 5 Subjects: %d %d %d %d %d\n",sub1,sub2,sub3,sub4,sub5);
	printf("TotalMarks :         %d\n",TotalMarks);
	printf("Total Percentage :   %2f\n",per);
}