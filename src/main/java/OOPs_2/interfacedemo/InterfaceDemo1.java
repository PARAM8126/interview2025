package OOPs_2.interfacedemo;

interface Animal {
    void bark();
}

interface Dog {
    void eat();
}

class Puppy implements Animal, Dog {
    public void bark() {
        System.out.println("barking");
    }

    public void eat() {
        System.out.println("eating");
    }
}

public class InterfaceDemo1
  {
    public static void main(String[] args) {

       
        Animal obj = new Puppy();
        obj.bark();

        Dog d = new Puppy();
        d.eat();

       // OR use Puppy reference to call both methods
        Puppy p = new Puppy();
        p.bark();
        p.eat();
    }
}

      
        
        
