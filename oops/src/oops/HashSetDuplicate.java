package oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Students
{
	private int rollno;
	private String name;
	private int age;
	Students(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	
	public Students() {
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
		return this.getRollno() == ((Students)obj).getRollno() && this.getName()==((Students)obj).getName();
	}
	@Override
	public int hashCode() {
		return rollno;
	}
}

public class HashSetDuplicate {
	public static void main(String[] args) {
		
		Students s1=new Students(1,"anugya",22);
		Students s2=new Students(1,"anugya",22);
		Students s3=new Students(3,"prema",21);
		
		Set<Students> li=new HashSet<Students>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
		Students st=(Students)itr.next();
		System.out.println(st+"  "+st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
		
		
		
	}

}
