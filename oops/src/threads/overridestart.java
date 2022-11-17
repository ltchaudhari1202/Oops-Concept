package threads;
class Mythread3 extends Thread{
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Manmade start method");
		//if we not provide start method then run method can't invoke
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method");
	}
}
public class overridestart {
	public static void main(String[] args) {
		Mythread3 thr3=new Mythread3();
		
		thr3.start();
		System.out.println("main method");
	}

}
