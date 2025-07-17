package OOPs_2.Polymorphism;
class AMethodOverriding5 {
	int show() {
		System.out.println("1");
		return 0;
	}
}

class BMethodOverriding5 extends AMethodOverriding5 {
	@Override
	int show() {
		System.out.println("2");
		return 0;
	}
}

public class MethodOverriding5 {
	public static void main(String[] args) {
		AMethodOverriding5 ob3 = new BMethodOverriding5();
		ob3.show();  // Output: 2
	}
}
