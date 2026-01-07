package com.phoenix.syntaxchecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		MainApp app=new MainApp();
		app.parse();
	}
	
	public void parse()
	{
		boolean eof=false;
		String line="";
		boolean firstWord=true;
		//Read the file
		try {
			FileInputStream fin=new FileInputStream("content.txt");
			//Tokenize
			Scanner sc=new Scanner(fin);
			while(eof==false)
			{
				if(firstWord==true)
				{
					line=sc.nextLine();
					System.out.println("First Line:"+line);
					firstWord=false;
				}
				line+=sc.nextLine()+"|";
				/*
				 * System.out.println(line); System.out.println(sc.hasNext());
				 */
				if(sc.hasNext()==false)
				{
					eof=true;
				}
//				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] split=line.split("|");
		parse(split);
	}
	
	public void parse(String[] content)
	{
		System.out.println(content.length);
		ParsingStack stack=new ParsingStack();
		for(String ref:content)
		{
			System.out.println(ref);
			if(ref.substring(1) !="/")
			{
				stack.push(ref.substring(1,ref.length()-1));
			}
			else
			{
				String compare=stack.peek();
				System.out.println(compare);
			}
		}
	}
}
