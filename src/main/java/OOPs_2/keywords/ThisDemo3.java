package OOPs_2.keywords;

class ThisDemoo
{
	void m1()
	{
		System.out.println("i am in m1 method");
		m2();
		//this.m2();
	}
	void m2()
	{
		System.out.println("i am in m2 method");
	}
	public static void main(String[] args)
	{
		ThisDemoo ob=new ThisDemoo();
		ob.m1();
	}
}
