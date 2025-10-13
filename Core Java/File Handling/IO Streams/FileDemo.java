package p1;

import java.io.*;
 
class FileDemo {

	public static void mainw(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream ("C://Users/Admin/Documents/13oct.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(new Student(101,"Prashant",200));
			System.out.println("Inside WriteFile");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}




public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("C://Users/Admin/Documents/13oct.txt");
		DataInputStream dis=new DataInputStream (fis);
		try (ObjectInputStream ois = new ObjectInputStream(dis)) {
			Student s1 = (Student)ois.readObject();
			System.out.println(s1);
		}
		
	}
	catch (FileNotFoundException e1)
	{
		e1.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}