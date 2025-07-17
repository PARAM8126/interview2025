class AMethodOverriding1
{
	void show1()
	{
		System.out.println("1");
	}
}
class BMethodOverriding1 extends AMethodOverriding1
{
	void show2()
	{
		System.out.println("2");
	}
}
class MethodOverriding1
{
	public static void main(String[] args)
	{
		AMethodOverriding1 ob1=new AMethodOverriding1();
		ob1.show1();

		BMethodOverriding1 ob2=new BMethodOverriding1();
		ob2.show2();

		AMethodOverriding1 ob3=new BMethodOverriding1();
		ob3.show1();
		//ob3.show2();			not possible
	}
}
