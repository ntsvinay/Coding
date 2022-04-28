package outPutBasedQuestion;
//deloitte
public class OverRidingSameMethodDiffParaType {
	public static void main(String[] args) {
		Child childObj = new Child();
		System.out.println(childObj.f(3));//6
		System.out.println(childObj.f(3.3));//6.6
		System.out.println(childObj.x+"--"+childObj.y);//9--1
	}

}

class Parent {
	int y=1;
	public int f(int x) {
		return x + 3;

	}
}

class Child extends Parent {
	double x=1.9;
	public double f(double x) {
		return x + 3.3;
	}
}
/*
 * output :- 6 6.6 1.9--1
 */