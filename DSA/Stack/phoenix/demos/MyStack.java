package com.phoenix.demos;

public class MyStack {
	
	private int top=0;
	private Node[] stack=new Node[10];
	static MyStack ref = new MyStack();
	
	private MyStack() {
		// TODO Auto-generated constructor stub
	}
	
	private MyStack(Node[] ref)
	{
		stack=ref;
	}

	public static MyStack getObject()
	{
		return ref;
	}
	
	public Node[] getStack() {
		return stack;
	}

	public void setStack(Node[] stack) {
		this.stack = stack;
	}
	
	public void push(int value)
	{
		if(top==0)
			
		stack[top++]=new Node(value);
	}
}
