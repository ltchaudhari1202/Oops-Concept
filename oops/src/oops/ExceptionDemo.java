package oops;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i=10;
		try {
			int c=i/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println("parent exception");
		}
		
	}

}
