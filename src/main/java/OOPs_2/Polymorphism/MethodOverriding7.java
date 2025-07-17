class ParentMethodOverridingWithSuper {
}

class ChildMethodOverridingWithSuper extends ParentMethodOverridingWithSuper {
}

class AMethodOverridingWithSuper {
    ParentMethodOverridingWithSuper show() {
        System.out.println("1 "); // from A
        return new ParentMethodOverridingWithSuper();
    }
}

class BMethodOverridingWithSuper extends AMethodOverridingWithSuper {
    ChildMethodOverridingWithSuper show() {
        System.out.println("2 "); // from B
        super.show(); //  calling parent class (A) method
        return new ChildMethodOverridingWithSuper();
    }
}

public class MethodOverriding7 {
    public static void main(String[] args) {
        AMethodOverridingWithSuper ob3 = new BMethodOverridingWithSuper();     // Parent reference, Child object
        ob3.show();          // Calls B's show() due to overriding
    }
}
