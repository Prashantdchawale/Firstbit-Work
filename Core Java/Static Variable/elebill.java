class ElectricityBill
{
    int bid;
    String name;
    int unit;

    static double rateperunit;
    static  //set default value for ratePerUnit
    {
        rateperunit=7;
    }


	//Default Constructor
    ElectricityBill()
	{
		this.bid=101;
		this.name="ABC";
		this.unit=10;
		System.out.println("Default constructor:");
		//this.rateperunit=50;
	}


	//Parameterized Constructor
	ElectricityBill(int i,String n,int u)
	{
		this.bid=i;
		this.name=n;
		this.unit=u;
		System.out.println("Parameterized constructor:");
		//this.rateperunit;
	}


	//Setters
    void setBid(int i)
	{
		this.bid=i;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setUnit(int u)
	{
		this.unit=u;
	}
	static void setRatePerUnit(double r)  //used static
	{
		rateperunit=r;
	}


	//Getters
    int getBid()
	{
		return bid;
	}
	String getName()
	{
		return name;
	}
	int getUnit()
	{
		return unit;
	}
	double getRatePerUnit()
	{
		return rateperunit;
	}


	//Display Fn
    void display()
	{
		System.out.println("BillId       :"+this.bid);
		System.out.println("Costemer Name:"+this.name);
		System.out.println("Units Used   :"+this.unit);
		System.out.println("RatePerUnit  :"+this.rateperunit+"\n");
    }


	//Fn to Calculate Total Bill
    void calculateElectricityBill()
    {
		double total = this.unit * rateperunit;
        System.out.println("Total Bill : " +this.bid+"  "+ this.name+" = " +total+"\n");
    }
}//class ElectricityBill ends here


class Test
{
    public static void main (String [] args)
    {
		//ElectricityBill e3=new ElectricityBill();
		//e3.display();

        ElectricityBill e1=new ElectricityBill(101,"PRASHANT",50); //parameterizes Constructor
		e1.display();
       	e1.calculateElectricityBill();

        ElectricityBill e2=new ElectricityBill(201,"Rahul",50);    //parameterizes Constructor
        e2.display();
		e2.calculateElectricityBill();
		
		ElectricityBill.setRatePerUnit(10);                        //Total Bill

		e1.display();
       	e1.calculateElectricityBill();

		e2.display();
		e2.calculateElectricityBill();
    }
}//class Test ends here