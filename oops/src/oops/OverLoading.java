package oops;

class ExmpleOverload{
	void method() {
		System.out.println("no arg meothd");
	}
	void method(int i) {
		System.out.println("argument method"+i);
	}
}

public class OverLoading{
	public static void main(String[] args) {
		ExmpleOverload ex=new ExmpleOverload();
		ex.method();
		ex.method(6);
	}
}
