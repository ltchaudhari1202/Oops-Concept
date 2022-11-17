package oops;

import java.io.IOException;

class Ex1{
	void method() throws Exception {
		System.out.println("parent");
	}
}
class Ex2 extends Ex1{
	void method()   {
		try {
			super.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Ex1 ex=new Ex2();
		//ex.method();
		Ex2 ex1=(Ex2)ex;
		ex1.method();
		
		
	}

}
