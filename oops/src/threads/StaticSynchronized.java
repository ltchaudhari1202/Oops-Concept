package threads;
class Table1{
	synchronized static void print(int n) {
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
class Mythread7 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Table1.print(5);
	}
}

class Mythread8 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Table1.print(2);
	}
}

public class StaticSynchronized {
	public static void main(String[] args) {
		Mythread7 t7=new Mythread7();
		Mythread8 t8=new Mythread8();
		t7.start();
		t8.start();
		
	}

}
