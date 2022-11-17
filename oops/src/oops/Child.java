package oops;
class Parent{
	int i=10;
	
	Parent(){
		System.out.println("default parent");
	}
	Parent(int i){
		this();
		System.out.println("parameterised"+i);
	}
	{
		System.out.println("parent instance");
	}
	
}

public class Child extends Parent {
	Child(){
		super(5);
		System.out.println("default child");
	}
	public static void main(String[] args) {
		Child c=new Child();
	}

}
