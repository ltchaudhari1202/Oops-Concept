package threads;

public class ProducerDemo extends Thread {
	Factory f;
	
	public ProducerDemo(Factory f) {
		// TODO Auto-generated constructor stub
		this.f=f;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				f.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
