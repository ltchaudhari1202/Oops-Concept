package threads;
class MyThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method");
	}
}
public class starnrun {
	public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println("threadMain:"+t.getName());
	MyThread2 t1=new MyThread2();
	Thread thr=new Thread(t1);
	t1.start();
	thr.start();
	System.out.println("Mythread"+t1.getName());
	System.out.println("thread"+thr.getName());
	t1.run();
	//t1.start();
	
}
	

}
