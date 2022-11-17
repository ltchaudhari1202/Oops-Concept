package oops;
class parent11{
	parent11(){
		super();//call object class
		System.out.println("parent");
	}
}
class child11 extends parent11{
	child11(int i){
		System.out.println(i);
	}
	
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance bolck");
	}
}

public class ConstructorDemo1 {
	static public void main(String[] args) {
		child11 c1=new child11(1);
		child11 c2=new child11(1);
	}

}
