package oops;

class Overloading_ex1
{ 
 public void methodOne() 
 { 
 System.out.println("no-arg method"); 
 } 
 public void methodOne(int i) 
 { 
 System.out.println("int-arg method"); 
 } 
 public void methodOne(double d) 
 { 
 System.out.println("double-arg method"); 
 } 
 public static void main(String[] args) 
 { 
	 Overloading_ex1 t=new Overloading_ex1(); 
 t.methodOne();//no-arg method 
 t.methodOne(10);//int-arg method 
 t.methodOne(10.5);//double-arg method 
 } 
} 
