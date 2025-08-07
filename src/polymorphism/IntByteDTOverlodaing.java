package polymorphism;

public class IntByteDTOverlodaing {
	public void method(Integer a) {
		System.out.println(a + "-from Integer");
	}
	
	public void method(int a) {
		System.out.println(a + "-from int");
	}

	public void method(Byte a) {
		System.out.println(a + "-from Byte");
	}

	public static void main(String[] args) {
		new IntByteDTOverlodaing().method(1);
	}

}
