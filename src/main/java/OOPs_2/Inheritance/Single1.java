class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Single1 {
    public static void main(String[] args)
    {
        Dog1 d = new Dog1();
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}
