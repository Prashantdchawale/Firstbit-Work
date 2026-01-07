package com.phoenix.demos;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * PayFees[] students= {new OnlineStudent(),new DemoStudent()};
		 * 
		 * for(PayFees ref:students) { ref.payOnline(); }
		 */
		//Approach 1: Implement in a class
		
		ArithmeticOps add=new Addition();
		System.out.println(add.calculate(12, 12));
		
		//Approach 2:Anonymous inner class
		
		ArithmeticOps subtract=new ArithmeticOps()
				{
					public int calculate(int a, int b)
					{
						return a-b;
					}
				};
		System.out.println(subtract.calculate(12, 12));
		
		//Approach 3: Lambda Expression
		
		ArithmeticOps multi=(op1,op2)->
		{
			System.out.println("Inside lambda");
			return op1*op2;
		}
		
		System.out.println(multi.calculate(12, 12));
	}

}
