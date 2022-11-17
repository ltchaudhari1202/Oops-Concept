package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

class Info1{
	int rollNo;
	String name;
	public Info1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info1(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class nameComparetor implements Comparator<Info1>{

	@Override
	public int compare(Info1 o1, Info1 o2) {
		if(o1.name==o2.name)
			return 0;
		
		return -1;
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Stack s=new Stack();
		ArrayList<Info1> al=new ArrayList<>();
		al.add(new Info1(3,"c"));
		al.add(new Info1(2,"b"));
		Collections.sort(al, new nameComparetor());
		
		for(Info1 i1:al) {
			System.out.println(i1.rollNo+" "+i1.name);
		}
	}
}
