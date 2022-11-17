package threads;

public class ConsumerDemo extends Thread {
	Factory f;
	
	public ConsumerDemo(Factory f) {
		// TODO Auto-generated constructor stub
		this.f=f;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				f.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
