package p1;

class InvalidMarksException extends Exception
{
	public String toString() 
	{
		return "Invalid Marks";
	}
}
	

public class TestMarks 
{
	int marks;
	
	public TestMarks(int marks) 
	{
		this.marks=marks;
	}
	
	public void validate() {
        try {
            // Invalid range check
            if (marks < 0 || marks > 100) 
            {
                throw new InvalidMarksException();
            }

            // Valid grading system
            if (marks >= 75) {
                System.out.println("First Class with Distinction");
            } else if (marks >= 61 && marks <= 74) {
                System.out.println("First Class");
            } else if (marks >= 51 && marks <= 60) {
                System.out.println("Second Class");
            } else if (marks >= 35 && marks <= 50) {
                System.out.println("Pass Class");
            } else {
                System.out.println("Fail");
            }
        } catch (InvalidMarksException me) {
            System.out.println(me);
        }
    }
}

	
class Test1 {
    public static void main(String[] args) {
    	 TestMarks m1 = new TestMarks(48);   // Will print: Fail
         m1.validate();

         TestMarks m2 = new TestMarks(58);  // Will print: First Class with Distinction
         m2.validate();

         TestMarks m3 = new TestMarks(75); // Will throw: Invalid Marks
         m3.validate();        
    }
}