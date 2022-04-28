package askedInterviewQuestion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultiPalCatch {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("aaa");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}
	}

}
