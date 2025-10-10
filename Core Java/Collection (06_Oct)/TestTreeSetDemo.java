import java.util.*;
public class TestTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1=new TreeSet();
		
		t1.add(10);
		t1.add(30);
		t1.add(30);		 	//Duplicate Value
		t1.add(30);	  		//Duplicate Value
		t1.add(20);
		t1.add(40);
		
		System.out.println(t1);
		
		//System.out.println(t1.get(2));  //not working
	}
}