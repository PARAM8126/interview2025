class A {
    void show(int a) {
        System.out.println(a);
    }
}

class B extends A {
    void show(String a) {
        System.out.println(a);
    }
}

class MethodOverriding4 {
    public static void main(String[] args) {
        A ob3 = new B();     // Upcasting: parent reference, child object
        ob3.show(10);        // Method call
    }
}
