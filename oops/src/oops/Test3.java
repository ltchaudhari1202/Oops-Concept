package oops;

class Threads extends Thread {
	public void start()

	{
		super.start();
		System.out.println("start method");
	}

	public void run() {

		System.out.println("run method");
	}
}

class Test3 {
	public static void main(String[] args) {
		Threads t = new Threads();
		t.start();
		System.out.println("main method");
	}
}