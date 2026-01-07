package com.phoenix.demos;

public class MainApp {

	public static void main(String[] args) {
		
		Graph graph=new Graph();
		Node n1=new Node("Chetan");
		Node n2=new Node("Mahesh");
		Node n3=new Node("Suresh");
		graph.insertNode(n1);
		graph.insertNode(n2);
		graph.insertNode(n3);
		
		graph.connectNodes(n1, n2);
		graph.connectNodes(n1, n3);
		graph.connectNodes(n3, n1);
		graph.print();
		
	}

}
