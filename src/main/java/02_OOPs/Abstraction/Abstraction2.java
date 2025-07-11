
//  Not allowed: Cannot instantiate abstract class

abstract class Animal
  {
    abstract void sound();  
    void sleep()
    {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal
  
{
    void sound()
   {
        System.out.println("Dog barks");
    }
}

public class Abstraction2
  {
    public static void main(String[] args)
    {
        
        // Animal a = new Animal();  //  Compile-time error

        // Allowed: Abstract class reference, subclass object
     
		
		Animal a = new Dog(); 
        a.sound();            
        a.sleep();            
    }
}
