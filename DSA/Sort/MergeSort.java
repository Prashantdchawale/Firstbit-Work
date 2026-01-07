package com.phoenix.demos;

public class MergeSort {

	int[] numbers= {23,12,1,66,111,21};
	
	public static void main(String[] args) {
		
		MergeSort app=new MergeSort();
		app.sort(app.numbers,0,app.numbers.length-1);
		app.display(app.numbers);
	}

	public void sort(int[] ref,int left, int right)
	{
		if(left < right)
		{
			int middle=left + (right - left) /2;
			sort(numbers,left,middle);
			sort(numbers,middle+1, right);
			
			merge(numbers,left, middle, right);
//			System.out.print(left + " " + middle + " " + right); 
//			display(numbers);
		}
	}
	
	public void merge(int[] ref, int left, int middle, int right)
	{
		int leftSize=middle-left+1;
		int rightSize=right-middle;
		
		int[] leftArray=new int[leftSize];
		int[] rightArray=new int[rightSize];
		
		for(int leftCtr=0;leftCtr<leftSize;++leftCtr)
		{
			leftArray[leftCtr]=numbers[left+leftCtr];
		}
		for(int rightCtr=0;rightCtr<rightSize;++rightCtr)
		{
			rightArray[rightCtr]=numbers[middle+1+rightCtr];
		}
		
		int leftCtr=0;
		int rightCtr=0;
		
		int mergeCtr=left;
		
		while(leftCtr< leftSize && rightCtr < rightSize)
		{
			if(leftArray[leftCtr] <= rightArray[rightCtr])
			{
				numbers[mergeCtr]=leftArray[leftCtr];
				leftCtr++;
			}
			else
			{
				numbers[mergeCtr]=rightArray[rightCtr];
				rightCtr++;
			}
			mergeCtr++;
		}
		while(leftCtr < leftSize)
		{
			numbers[mergeCtr]=leftArray[leftCtr];
			leftCtr++;
			mergeCtr++;
		}
		while(rightCtr<rightSize)
		{
			numbers[mergeCtr]=rightArray[rightCtr];
			rightCtr++;
			mergeCtr++;
		}
	}
	
	public void display(int[] ref)
	{
		for(int value:ref)
		{
			System.out.print(value+ " ");
		}
		System.out.println();
	}
	
}
