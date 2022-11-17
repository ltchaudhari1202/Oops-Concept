package oops;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class HS {

	public static void main(String[] args) {
		HashSet <Integer>hs=new HashSet<>();
		System.out.println("add element:"+hs.add(1));
		System.out.println("add duplicate:"+hs.add(1));
		hs.add(5);
		hs.add(null);
		hs.add(null);
		hs.add(new Integer(6));
		System.out.println(hs);
		Stack<Integer>s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("-----------");
		System.out.println(s.peek());
		System.out.println("------------");
		System.out.println(s.search(3));
		HashMap ma=new HashMap<>();
		
		Object o;
	}
}
