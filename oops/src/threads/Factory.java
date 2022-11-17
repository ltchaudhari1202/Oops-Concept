package threads;

public class Factory {
	private int i=0;
	private boolean flag=false;
	
	public synchronized void produce() throws InterruptedException{
		Thread.sleep(1000);
		if(flag==true) {
			wait();
		}
		i++;
		System.out.println("Produced:"+i);
		flag=true;
		notify();
		
	}
	
	public synchronized void consume() throws InterruptedException {
		Thread.sleep(1000);
		if(flag==false) {
			wait();
		}
		System.out.println("consumed:"+i);
		flag=false;
		notify();
	}

}
