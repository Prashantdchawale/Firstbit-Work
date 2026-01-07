package com.phoenix.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//This is NOT a weighted graph
//Weighted graph will have a value associated with the edge
public class Graph {
	
	Map<Node, List<Node>> adjacencyList;
	
	public Graph() {
		adjacencyList=new HashMap();
	}

	public void insertNode(Node v1)
	{
		adjacencyList.put(v1, new ArrayList());
	}

	public void print() {
		for(Node current:adjacencyList.keySet())
		{
			System.out.print(current.data);
			List<Node> temp=adjacencyList.get(current);
			System.out.println(" Total number of neighbours for "+ current.data +" is "+ temp.size());
			for(Node neighbour:temp)
			{
				System.out.println("   " + neighbour.data);
			}
		}
	}

	public void connectNodes(Node n1, Node n2) 
	{
		//Source adds the destination in it's list
		List<Node> temp=adjacencyList.get(n1);
		temp.add(n2);
		//Destination adds the source in it's list
		//For Directed graph, comment the following line
		//adjacencyList.get(n2).add(n1);
	}
}
