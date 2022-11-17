package threads;

class Test3 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
		int div=10/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//System.out.println("division"+div);
	}
	
}

public class ExceptionDemo {
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.start();
	}

}
