package OOPs_2.Inheritance;

class AnimalMultilevel1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogMultilevel1 extends AnimalMultilevel1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class PuppyMultilevel1 extends DogMultilevel1 {
    void weep() {
        System.out.println("Puppy weeps");
    }
}


      class Multilevel1
     {
         public static void main(String[] args)
         {
             PuppyMultilevel1 P = new PuppyMultilevel1();
             P.eat();
             P.bark();
             P.weep();
         }
     }
