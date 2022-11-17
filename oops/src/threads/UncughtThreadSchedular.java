package threads;

import java.lang.Thread.UncaughtExceptionHandler;

class SampleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread name : " + Thread.currentThread().getName());
		int div = 10 / 0;
		System.out.println("Div=:" + div);
	}
}

public class UncughtThreadSchedular {
	public static void main(String[] args) {
		Thread.UncaughtExceptionHandler exceptionHandler = new UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(Thread.currentThread().getName() + " threw exception " + e.getMessage());
			}
		};
		SampleThread thread = new SampleThread();
		thread.setUncaughtExceptionHandler(exceptionHandler);
		thread.start();
	}

}
