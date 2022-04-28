package leetCode.Easy;

public class NumberOfSegmentInString {

	public int getSegment(String s) {
		int count = 0;
		
			String[] strArr = s.split(" ");
			for (String ch : strArr) {
				if (ch.equals(null)|| ch.equals("''") || ch.equals("") ||ch.equals(" ")) {

				} else {
					count++;
				}

			}
			return count;
		}

	

	public static void main(String[] args) {
		System.out.println(new NumberOfSegmentInString().getSegment(""));
	}
}
