package oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Student
{
	private int rollno;
	private String name;
	private int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		return this.getRollno() == ((Student)obj).getRollno();
	}
	@Override
	public int hashCode() {
		return rollno;
	}


	




	
}

public class ArrayListOwnObject {
	public static void main(String[] args) {
		Student s1=new Student(1,"anugya",22);
		Student s2=new Student(1,"anugya",22);
		Student s3=new Student(3,"prema",21);
		
		Set<Student> li=new HashSet<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
		Student st=(Student)itr.next();
		System.out.println(st+"  "+st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
		
		
		
	}
	
	
	
	
	


}