package p3;

import java.util.TreeMap;

class MyKey implements Comparable
{
	int key;
	
	MyKey(int k)
	{
		this.key=k;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyKey m1= (MyKey)o;
		return this.key-m1.key;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Key "+this.key;
	}
}//class MyKey ends here


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tm= new TreeMap();
		tm.put(new MyKey(7), new Student(7,333,"Dhoni"));
		tm.put(new MyKey(10), new Student(10,444,"Dhoni"));
		tm.put(new MyKey(5), new Student(5,777,"Dhoni"));
		
		System.out.println(tm);
	}
}
