
// Abstract class needs to be extended and its method implemented. 
// It cannot be instantiated.

abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("starts with key");
	}
}
class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("starts with kick");
	}
}
class AbstractDemo
{
	public static void main(String[] args)
	{
		Car ob=new Car();
		ob.start();

		System.out.println("---------------------");

		Scooter ob2=new Scooter();
		ob2.start();
	}
}
