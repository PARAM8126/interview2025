class AMethodOverriding3 {
    void show(int a) {
        System.out.println(a);
    }
}

class BMethodOverriding3 extends AMethodOverriding3 {
    void show(int a) {
        System.out.println(a);
    }
}

class MethodOverriding3 {
    public static void main(String[] args) {
        AMethodOverriding3 ob3 = new BMethodOverriding3();     // Parent reference, child object
        ob3.show(20);        // Call to overridden method
    }
}
