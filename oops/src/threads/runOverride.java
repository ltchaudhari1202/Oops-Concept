package threads;
class Mythread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("deafult run");
	}
	public void run(int i) {
		System.out.println("overload run");
	}
}
public class runOverride {
	public static void main(String[] args) {
		Mythread1 thr=new Mythread1();
		thr.start();
		thr.run();
		thr.run(0);
	}

}
