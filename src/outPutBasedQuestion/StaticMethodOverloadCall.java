package outPutBasedQuestion;

public class StaticMethodOverloadCall {
	public static void main(String[] args) {
		ImParent pObj = new ImParent();
		System.out.println(pObj.staticMethod());
		System.out.println(pObj.staticMethod1());
	}
}

class ImChild {
	public static String staticMethod1() {
		return "return from imChild";
	}
}

class ImParent extends ImChild {
	public static String staticMethod() {
		return "return from ImParent";
	}
}
