class A {
    void show(int a) {
        System.out.println(a);
    }
}

class B extends A {
    void show(int a) {
        System.out.println(a);
    }
}

class MethodOverriding3 {
    public static void main(String[] args) {
        A ob3 = new B();     // Parent reference, child object
        ob3.show(20);        // Call to overridden method
    }
}
