class Parent {
}

class Child extends Parent {
}

class A {
    Parent show() {
        System.out.println("1 "); // from A
        return new Parent();
    }
}

class B extends A {
    Child show() {
        System.out.println("2 "); // from B
        super.show(); //  calling parent class (A) method
        return new Child();
    }
}

public class MethodOverridingWithSuper {
    public static void main(String[] args) {
        A ob3 = new B();     // Parent reference, Child object
        ob3.show();          // Calls B's show() due to overriding
    }
}
