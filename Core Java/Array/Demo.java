class Demo
{
	public static void main(String []args)
	{
        int i;
        int[]arr;
        arr=new int[5];
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
		//above code prints 5 times 0


		Emp[]brr;
		brr=new Emp[5];				
		//array of referance
		for(i=0;i<arr.length;i++)
        {
        System.out.println(brr[i]);
        }
		//above code prints 5 times null


		for (i = 0; i < brr.length; i++)
        brr[i].display();
		//this gives NullPointerException
	}
}
