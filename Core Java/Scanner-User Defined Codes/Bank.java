import java.util.Scanner;

class Bank
{
	int accno;
	String holdername;
	double balance;
	String branch;

	void setAccno(int no)
	{
		this.accno=no;
	}
	void setHoldername(String name)
	{
		this.holdername=name;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	void setBranch(String branch)
	{
		this.branch=branch;
	}


	int getAccno()
	{
		return accno;
	}
	String getHoldername()
	{
		return holdername;
	}
	double getBalance()
	{
		return balance;
	}
	String getBranch()
	{
		return branch;
	}


	void display()
	{
		System.out.println("Account No : "+this.accno);
		System.out.println("Holder Name: "+this.holdername);
		System.out.println("Balance    : "+this.balance);
		System.out.println("Branch     : "+this.branch);
	}


	Bank()
	{
		this.accno=2686;
		this.holdername="PRASHANT";
		this.balance=9000.00;
		this.branch="Laur";
	}


	Bank(int a,String n,String b,double ba)
	{
		System.out.println("\nParameterized Constructor");
		this.accno=a;
		this.holdername=n;
		this.balance=ba;
		this.branch=b;
	}
}//class Bank ends here


class Test
{
	public static void main (String [] a)
	{
		Scanner sc = new Scanner(System.in);

		Bank b1=new Bank();
		b1.display();
		System.out.println("Enter A/c Number     :");
		int aa=sc.nextInt();
        System.out.println("Enter A/c HolderName :");
		String ab=sc.next();
		System.out.println("Enter Available Balance:");
		double ac =sc.nextDouble();
		System.out.println("Enter Branch Here    :");
		String ad=sc.next();

		Bank b2=new Bank(aa, ab, ad, ac);
		b2.display();
	}
}	