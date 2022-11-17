package threads;

class yDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1;i<=3;i++) {
			Thread.yield();
			System.out.println("Child");
			
		}
	}
	
}
public class YieldDemo {
	public static void main(String[] args) {
		yDemo y=new yDemo();
		y.start();
		//y.yield();
		for(int i=1;i<=3;i++) {
			System.out.println("parent");
		}
	}

}
