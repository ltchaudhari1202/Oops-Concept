package oops;

class parent1{
	void methodOne() {
		System.out.println("parent method");
	}
}
class child1 extends parent1{
	void methodTwo() {
		System.out.println("Child method");
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		parent1 p=new child1();
		p.methodOne();
		child1 c=(child1)p;
		c.methodOne();
		c.methodTwo();
		
	}

}
