package com.phoenix.syntaxchecker;

import java.util.ArrayList;
import java.util.List;

public class ParsingStack {

	List<String> stack=new ArrayList<String>();
	int top=0;
	
	public void push(String value)
	{
		stack.add(top++,value);
	}
	
	public String pop()
	{
		return stack.remove(top--);
	}
	
	public String peek()
	{
		return stack.get(top);
	}
}
