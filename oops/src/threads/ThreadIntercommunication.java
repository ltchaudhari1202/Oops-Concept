package threads;

public class ThreadIntercommunication {
	public static void main(String[] args) {
		
		Factory f=new Factory();
		ProducerDemo pd=new ProducerDemo(f);
		ConsumerDemo cd=new ConsumerDemo(f);
		pd.start();
		cd.start();
	}
	
	

}
