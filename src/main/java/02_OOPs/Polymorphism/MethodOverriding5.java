class A
{
	int show()  // return type is int
	{
		System.out.println("1");
		return 0;
	}
}
class B extends A
{
	void show() // return type is void
	{
		System.out.println("2");
	}
}
class MethodOverriding5
{
	public static void main(String[] args)
	{
		A ob3=new B();
		ob3.show(); //  compile-time error

	}
}
