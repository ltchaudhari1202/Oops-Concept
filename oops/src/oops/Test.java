package oops;

class Test 
{ 
 public void methodOne(String s) 
 { 
 System.out.println("String version"); 
 } 
 public void methodOne(int m) 
 { 
 System.out.println("Integer version"); 
 } 
 
 public void methodOne(Object o)
 { 
 System.out.println("Object version"); 
 } 
 public static void main(String[] args) 
 { 
 Test t=new Test(); 
 t.methodOne("bhaskar");//String version 
 t.methodOne(new Object());//Object version 
 t.methodOne(null);
 Integer n=null;
 t.methodOne(n);//String version 
 } 
} 