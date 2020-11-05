package aboutConstructors;

public class Child extends Parent {
	String s = "Child variable";

	public void m1() {
		System.out.println(this.s);
		System.out.println(super.s);
	}
}
