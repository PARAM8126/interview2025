class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}


      class Multilevel1
     {
         public static void main(String[] args)
         {
             Puppy P = new Puppy();
             P.eat();
             P.bark();
             P.weep();
         }
     }
