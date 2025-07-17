package OOPs_2.Polymorphism;
class AMethodOverriding2 {
    void show() {
        System.out.println("1");
    }
}

class BMethodOverriding2 extends AMethodOverriding2 {
    void show() {
        System.out.println("2");
    }
}

class MethodOverriding2 {
    public static void main(String[] args) {
        AMethodOverriding2 ob1 = new AMethodOverriding2();
        ob1.show();        // Output: 1

        BMethodOverriding2 ob2 = new BMethodOverriding2();
        ob2.show();        // Output: 2

        AMethodOverriding2 ob3 = new BMethodOverriding2();   // Upcasting
        ob3.show();        // Output: 2 : runtime polymorphism

        // ob3.show();   : this line is absolutely possible and valid
    }
}
