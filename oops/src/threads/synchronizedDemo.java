package threads;
class Display{
	public synchronized void demo(String name) {
		for(int i=1;i<5;i++) {
			System.out.print("Good morning:");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
}
class Mythread4 extends Thread{
	Display d;
	String name;
	public Mythread4(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		d.demo(name);
	}
}

public class synchronizedDemo {
public static void main(String[] args) {
	Display d1=new Display();
	Display d2=new Display();
	Mythread4 t3=new Mythread4(d1,"lokesh");
	Mythread4 t4=new Mythread4(d1, "Mayur");
	t3.start();
	t4.start();
}
}
