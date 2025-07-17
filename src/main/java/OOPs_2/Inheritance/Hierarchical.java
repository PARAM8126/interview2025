class AHierarchical
{
	void show1()
	{
		System.out.println("i am in class A");
	}
}
class BHierarchical extends AHierarchical
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class CHierarchical extends AHierarchical
{
	void show3()
	{
		System.out.println("i am in class C");
	}
}
 public class Hierarchical
{
	public static void main(String[] args)
	{
		AHierarchical ob1=new AHierarchical();
		ob1.show1();

		BHierarchical ob2=new BHierarchical();
		ob2.show2();
		ob2.show1();

		CHierarchical ob3=new CHierarchical();
		ob3.show3();
		ob3.show1();
	}
}
