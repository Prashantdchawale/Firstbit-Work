package com.phoenix.demos;

public class QuickSort{
	int[] numbers= {23,12,1,66,3,21};

	public static void main(String[] args) {

		QuickSort app=new QuickSort();
		app.quick(app.numbers);
		app.print();
	}

	public void print()
	{
		for(int ctr=0;ctr<numbers.length;ctr++)
		{
			System.out.print(numbers[ctr]+" ");
		}
		System.out.println();
	}
	public void quick(int[] ref)
	{
		sort(ref,0,ref.length-1);
	}
	
	public void sort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int divisionPos=divide(arr,low,high);
			sort(arr,low,divisionPos-1);
			sort(arr,divisionPos+1,high);
		}
	}
	
	public int divide(int[] ref,int low, int high)
	{
		int pivot=ref[high];
		int first=low-1;
		
		for(int second=low;second < high; second++)
		{
			if(ref[second] <= pivot)
			{
				first++;
				int temp=ref[first];
				ref[first]=ref[second];
				ref[second]=temp;
			}
		}
		int temp=ref[first+1];
		ref[first+1]=ref[high];
		ref[high]=temp;
		return first+1;
	}
}
