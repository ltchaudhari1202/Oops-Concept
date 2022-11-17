package oops;

class MyThread extends Thread 
{
	public void run() {
		System.out.println("run method");
		
	}
	} 
class Test2 
{ 
 public static void main(String[] args) 
 { 
 MyThread t=new MyThread(); 
 t.start(); 
 } 
}