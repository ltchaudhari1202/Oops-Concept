package oops;

import java.util.Random;

public class StaticBlock {
	static int[]values=new int[10];
	static int i;
	static {
		System.out.println("static demo");
		for(int i=0;i<values.length;i++) {
			values[i]=new Random().nextInt();
		}
	}
	public void listValues() {
		for(int i=0;i<10;i++) {
			System.out.println(values[i]);
		}
	}
	public static void main(String[] args) {
		StaticBlock s1=new StaticBlock();
		StaticBlock s2=new StaticBlock();
		
		s1.listValues();
		System.out.println("--------------------");
		s2.listValues();
		System.out.println(StaticBlock.i);
		
	}

}
