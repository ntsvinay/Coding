package askedInterviewQuestion;

class PrintNumber {
	synchronized void print() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass implements Runnable {
	PrintNumber pn;

	public ThreadClass(PrintNumber pn) {
		// TODO Auto-generated constructor stub
		this.pn = pn;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pn.print();

	}

}

class ThreadClass1 extends Thread {
	PrintNumber pn;

	public ThreadClass1(PrintNumber pn) {
		// TODO Auto-generated constructor stub
		this.pn = pn;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pn.print();

	}

}

public class CallSynchronizedMethodFromTwoThread {
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		ThreadClass th1 = new ThreadClass(pn);
		ThreadClass th3 = new ThreadClass(pn);
		ThreadClass1 th2 = new ThreadClass1(pn);
		th1.run();
		th3.run();
		// th2.start();

	}

}
