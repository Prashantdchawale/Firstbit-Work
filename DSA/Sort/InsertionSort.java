package com.phoenix.demos;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] numbers= {23,12,1,66,3,21};
		
		int arrLength=numbers.length;
		for(int outerCtr=1; outerCtr < arrLength; outerCtr++)
		{
			int compareValue=numbers[outerCtr];
			int innerCtr=outerCtr-1;
			
			while(innerCtr >= 0  && numbers[innerCtr] > compareValue)
			{
				numbers[innerCtr + 1] = numbers[innerCtr];
				innerCtr--;
			}
			numbers[innerCtr+1]=compareValue;
			for(int value:numbers)
			{
				System.out.print(value +" ");
			}
			System.out.println();
		}
		
		for(int value:numbers)
		{
			System.out.print(value +" ");
		}
	}

}
