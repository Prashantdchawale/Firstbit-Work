package com.phoenix.demos;

public class MyQueue {
	
	private int head=0;
	private int tail=0;
	private Node[] queue=new Node[2];
	static MyQueue ref = new MyQueue();
	
	private MyQueue() {
		// TODO Auto-generated constructor stub
	}
	
	private MyQueue(Node[] ref)
	{
		queue=ref;
	}

	public static MyQueue getObject()
	{
		return ref;
	}
	
	public Node[] getQueue() {
		return queue;
	}

	public void setQueue(Node[] v1) {
		this.queue = v1;
	}
	
	public void insert(int value)
	{
		if(tail+head==queue.length)
		{
			System.out.println("Queue is full for value "+value);
		}
		else
		{
			if(tail==queue.length && head!=0)
			{
				tail=0;
			}
			queue[tail]=new Node(value);
			tail++;
		}

	}
	
	public Node retrieve()
	{
		if(head==tail)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			return queue[head++];			
		}
		return null;
	}
}
