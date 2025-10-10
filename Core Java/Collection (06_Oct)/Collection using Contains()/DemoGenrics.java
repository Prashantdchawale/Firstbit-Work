import java.util.ArrayList;
public class DemoGenrics {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Sachin");
		a1.add("Rahul");
		//a1.add(10);			//int (Different Primitive DataType
		a1.add("Dhoni");
		
		System.out.println(a1);
	}
}
