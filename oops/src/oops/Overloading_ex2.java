package oops;

class Overloading_ex2 
{ 
// public void methodOne(int i) 
// { 
// System.out.println("int-arg method"); 
// } 
 public void methodOne(double d)
 { 
 System.out.println("double-arg method"); 
 } 
 public static void main(String[] args) 
 { 
	 Overloading_ex2 t=new Overloading_ex2(); 
 t.methodOne('a');//int-arg method 
 t.methodOne(10.5f);//float-arg method 
 //t.methodOne(10.5);//C.E:cannot find symbol 
 } 
}