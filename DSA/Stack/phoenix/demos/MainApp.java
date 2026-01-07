package com.phoenix.demos;

public class MainApp {

	public static void main(String[] args) {
		MainApp app=new MainApp();
		app.insert(10);
		app.insert(20);
		MyStack obj=MyStack.getObject();
		System.out.println(obj.hashCode());
	}

	public  void insert(int value)
	{
		MyStack ref=MyStack.getObject();
		System.out.println(ref.hashCode());
		ref.push(value);
	}
}
