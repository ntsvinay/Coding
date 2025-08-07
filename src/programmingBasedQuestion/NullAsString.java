package programmingBasedQuestion;

import java.util.Optional;

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
		new NullAsString().nullCheck("null");
		
		
	}
	public void nullCheck(Object obj)
	{
		System.out.println(obj+"<--- from String object");
	}

	public void nullCheck(String obj)
	{
		System.out.println(obj+"<--- from String");
	}
	public void nullCheck(char[] obj)
	{
		System.out.println(obj+"<--- from char arr");
	}

}
