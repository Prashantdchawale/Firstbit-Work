package p3;

import java.util.Comparator;

public class MyStudentRollComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1= (Student)o1;
		Student s2= (Student)o2;
		
		return s1.roll-s2.roll;			//roll
	
	}
}
