package outPutBasedQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialiZableClassWithNonSerialRefernce implements Serializable {
	NonSerializableClass nonS;
	String name;

	public static void main(String[] args) {
		SerialiZableClassWithNonSerialRefernce sR = new SerialiZableClassWithNonSerialRefernce();
		sR.name = "vinay";
		sR.nonS.lName = "baghel";
		try {
			FileOutputStream fout = new FileOutputStream("abc.txt");
			ObjectOutputStream oOut = new ObjectOutputStream(fout);
			oOut.writeObject(sR);
			fout.close();
			oOut.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fout = new FileInputStream("abc.txt");
			ObjectInputStream oOut = new ObjectInputStream(fout);
			SerialiZableClassWithNonSerialRefernce redObj = (SerialiZableClassWithNonSerialRefernce) oOut.readObject();
			fout.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class NonSerializableClass {
	String lName;

	public NonSerializableClass() {
		// TODO Auto-generated constructor stub
	}
}