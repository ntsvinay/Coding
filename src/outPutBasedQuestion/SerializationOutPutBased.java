package outPutBasedQuestion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationOutPutBased {

	public static void main(String arg[]) {

		MyClass myClas = new MyClass(7, 8.55, "hello");
		try {
			FileOutputStream fout = new FileOutputStream("aaa");
			ObjectOutputStream ob = new ObjectOutputStream(fout);
			ob.writeObject(myClas);
			ob.flush();
			ob.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("serial");
			e.printStackTrace();
			System.exit(0);
		}
		try {
			int x;
			FileInputStream fin = new FileInputStream("aaa");
			ObjectInputStream ob = new ObjectInputStream(fin);
			x = ob.readInt();
			System.out.println(x);
			fin.close();
			ob.close();

		} catch (Exception e) {
			System.out.println("deserial");
			e.printStackTrace();
			System.exit(0);

		}

	}

}

class MyClass implements Serializable{
	int id;
	double rank;
	String name;

	MyClass(int id, double rank, String name) {
		this.id = id;
		this.rank = rank;
		this.name = name;
	}
}
//output :--deserial