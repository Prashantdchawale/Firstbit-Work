package com.phoenix.demos;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers= {23,12,1,66,3,21};
		
		for(int outerCtr=0;outerCtr<numbers.length;outerCtr++)
		{
			for(int innerCtr=0;innerCtr<numbers.length-outerCtr-1;innerCtr++)
			{
				if(numbers[innerCtr] > numbers[innerCtr+1])
				{
					int temp=numbers[innerCtr];
					numbers[innerCtr]=numbers[innerCtr+1];
					numbers[innerCtr+1]=temp;
				}
			}
			for(int value:numbers)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		for(int value:numbers)
		{
			System.out.print(value + " ");
		}
	}
}
