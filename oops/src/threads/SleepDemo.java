package threads;

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("a");
		Thread.sleep(1000);
		System.out.println("b");
		Thread.sleep(2000);
		System.out.println("c");
		Thread.sleep(1000);
		System.out.println("d");
	}

}
