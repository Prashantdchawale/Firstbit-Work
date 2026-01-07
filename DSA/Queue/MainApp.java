package com.phoenix.demos;

public class MainApp {

	public static void main(String[] args) {
		MainApp app=new MainApp();
		app.insert(10);
		app.insert(20);
		app.retrieve();
		app.insert(30);
		app.insert(40);
	}

	public void insert(int value)
	{
		MyQueue queue=MyQueue.getObject();
		queue.insert(value);
	}
	
	public void retrieve()
	{
		MyQueue queue=MyQueue.getObject();
		queue.retrieve();
	}
}
