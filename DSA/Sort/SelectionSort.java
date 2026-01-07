package com.phoenix.demos;

public class SelectionSort {

	public static void main(String[] args) {

		int[] numbers= {23,12,1,6,30,21};
		int arrLength=numbers.length;
		
		for(int outerCtr=0;outerCtr<arrLength-1;outerCtr++)
		{
			int indexOfMin=outerCtr; //This is the length of sorted area
			for(int innerCtr=outerCtr+1;innerCtr<arrLength;innerCtr++)
			{
				if(numbers[innerCtr]<numbers[indexOfMin])
				{
					indexOfMin=innerCtr;
				}
			}
			int temp=numbers[indexOfMin];
			numbers[indexOfMin]=numbers[outerCtr];
			numbers[outerCtr]=temp;
		}
		
		for(int value:numbers)
		{
			System.out.print(value+" ");
		}
	}

}
