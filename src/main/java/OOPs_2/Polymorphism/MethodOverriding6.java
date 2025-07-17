class ParentP
{
}
class ChildC extends ParentP
{
}
class Child2 extends ParentP
{
}
class Aaa
{
	ParentP show()
	{
		System.out.println("1");
		return new ParentP();
	}
}
class Bbb extends Aaa
{
	ChildC show()
	{
		System.out.println("2");
		return new ChildC();
	}
}
class MethodOverriding6
{
	public static void main(String[] args)
	{
		Aaa ob3=new Bbb(); // Reference of A, object of B
		ob3.show();    // At runtime, method of B is called
	}
}
