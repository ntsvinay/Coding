package programmingBasedQuestion;

public class NullAsString {
	public static void main(String[] args) {
		String str="null";
		
		System.out.println(str.length());
		if(str.equals(null)) {
			System.out.println("yes is null eqaul");
		}
		if(str.equals("null")) {
			System.out.println("yes is null equal in double quates");
			
		}
		if(str=="null")
		{
			System.out.println("yes it null with == in double quates");
		}
		if(str==null) {
			System.out.println("yes is null with ==");
			
		}
		
		
	}

}
