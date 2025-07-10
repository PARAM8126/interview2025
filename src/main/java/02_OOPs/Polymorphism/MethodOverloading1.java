class Test
{
    // Case 1: Different number of parameters

	void display() // Method with no parameter
	{
		System.out.println("1");
	}
	void display(int a) // Method with 1 parameter
	{
		System.out.println("2");
	}
	void display(int a, int b) // Method with 2 parameters
	{
		System.out.println("3");
	}
}
class MethodOverloading1
{
	public static void main(String[] args)
	{
		Test t=new Test(); // Create object of Test class
		t.display();       // No arguments → prints 1
		t.display(10);   // One int argument → prints 2
		t.display(10, 20);  // Two int arguments → prints 3
	}
}
