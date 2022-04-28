package askedInterviewQuestion;

public class StaticParentChild {

	public StaticParentChild() {
		// TODO Auto-generated constructor stub
		System.out.println("constracter");
	}

	static {
		System.out.println("static block");
	}

	public static void check() {
		System.out.println("static method");
	}

	public static void main(String[] args) {

		Parent1.abc1();
		Parent1 p = new Child();

		p.abc();
		System.out.println(p.a);
		Child.abc1();
		StaticParentChild a = null;
		a.check();
	}
}

class Parent1 {

	int a = 1;
	static int b = 2;

	void abc() {
		System.out.println("parent---" + b + "," + a);
	}

	static void abc1() {
		System.out.println("static parent---" + b + "," + new Parent1().a);
	}
}

class Child extends Parent1 {

	int a = 3;
	static int b = 4;

	void abc() {
		System.out.println("child----" + b + "," + a);
	}

	static void abc1() {
		System.out.println("static child----" + b + "," + new Child().a);
	}

}