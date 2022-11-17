package threads;
class jDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0;i<=5;i++) {
			System.out.println("child");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
class jDemo1 extends Thread{
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			
			for(int i=0;i<=5;i++) {
				System.out.println("child1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	
	
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		jDemo j=new jDemo();
		j.start();
		j.join();
		jDemo1 j1=new jDemo1();
		j1.start();
		//j1.join();
//		for(int i=0;i<=4;i++) {
//			System.out.println("main");
//		}
	}

}

