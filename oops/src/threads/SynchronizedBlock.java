package threads;
class Table{
	void print(int n) {
		synchronized (this) {
			for(int i=1;i<5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
class Mythread5 extends Thread{
	Table t;

	public Mythread5(Table t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		t.print(5);
	}
}

class Mythread6 extends Thread{
	Table t;

	public Mythread6(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		t.print(2);
	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		Table t=new Table();
		Mythread5 t1=new Mythread5(t);
		Mythread6 t2=new Mythread6(t);
		t1.start();
		t2.start();
	}

}
