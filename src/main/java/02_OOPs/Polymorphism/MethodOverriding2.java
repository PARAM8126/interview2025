class A {
    void show() {
        System.out.println("1");
    }
}

class B extends A {
    void show() {
        System.out.println("2");
    }
}

class MethodOverriding2 {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show();        // Output: 1

        B ob2 = new B();
        ob2.show();        // Output: 2

        A ob3 = new B();   // Upcasting
        ob3.show();        // Output: 2 : runtime polymorphism

        // ob3.show();   : this line is absolutely possible and valid
    }
}
