package oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Info implements Comparable<Info>{
	int rollNo;
	String name;
	public Info(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public Info() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public int compareTo(Info o) {
		// TODO Auto-generated method stub
		return this.rollNo-o.rollNo;
	}
	
	
}

public class ComparableExample{
	public static void main(String[] args) {
		ArrayList<Info> al=new ArrayList<>();
		al.add(new Info(2,"bb"));
		al.add(new Info (1,"aa"));
		Collections.sort(al);
		for(Info f:al) {
			System.out.println(f.rollNo+" "+f.name);
		}
	}
}