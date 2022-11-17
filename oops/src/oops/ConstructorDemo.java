package oops;
class Student1{
	Student1(){
		this(5);
		System.out.println("Default");
		
	}
	Student1(int x){
		this(3,4);
		System.out.println("single parameter");
		System.out.println(x);
		
	}
	Student1(int x, int y){
		System.out.println(x*y);
		System.out.println("double parameter");
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Student1 s=new Student1();
		ConstructorDemo.main(10);

	}
	public static void main(int i) {
		System.out.println(i);
		
	}
	
}
