class Test
{    
       
    //different  parameter sequence 

	void display(String a, int b)
	{
		System.out.println(a+", "+b);
	}
	void display(int a, String b)
	{
		System.out.println(a+", "+b);
	}
}
class MethodOverloading3
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(10, "Param");  // Call method with int first, then String
		t.display("Param", 10); // Call method with String first, then int
	}
}
