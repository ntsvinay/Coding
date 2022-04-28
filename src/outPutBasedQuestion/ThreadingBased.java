package outPutBasedQuestion;

public class ThreadingBased {
	public static void main(String[] args) {
		MyThread mThread = new MyThread();
		mThread.start();
		new MyThread(new MyInterface()).run();
		new MyInterface().run();
	}

}

class MyThread extends Thread {
	Runnable rn;

	public MyThread() {

	}

	public MyThread(Runnable rn) {
		// TODO Auto-generated constructor stub
		this.rn = rn;
	}

	public void run() {
		System.out.println("itis fomr thread");
	}
}

class MyInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("it is from interface");

	}

}
