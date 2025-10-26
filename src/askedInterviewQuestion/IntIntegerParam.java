package askedInterviewQuestion;

public class IntIntegerParam {

	public void intParam(int a, int b) {
		System.out.println(a + b + "-from int");
	}

	public void intParam(Integer a, Integer b) {
		System.out.println(a + b + "-from Integer");
	}

	public void nullCheck(Object obj) {
		System.out.println(obj + "--from obj");
	}

	public void nullCheck(String obj) {
		System.out.println(obj + "--from String");
	}


	 public void nullCheck(char[] obj) { System.out.println(obj + "--from char");
	  }


	  public void nullCheck(Integer obj) { System.out.println(obj + "--from char");
	  }
//above method will occur ambiguity error
	public static void main(String[] args) {
		new IntIntegerParam().intParam(1, 1);
		new IntIntegerParam().nullCheck("null");
	}

}
