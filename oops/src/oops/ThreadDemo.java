package oops;

class ChildThread extends Thread{
	public void run() {
		System.out.println("hello");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(5);
		System.out.println("main thread");
		ChildThread c=new ChildThread();
		c.start();
		c.setPriority(10);
		System.out.println(c.getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}

}
