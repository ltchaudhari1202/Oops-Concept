package oops;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test1 {
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<>();
		l.add("aaa");
		l.add("bbb");
		ListIterator<String>itr=l.listIterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			if(string.equalsIgnoreCase("aaa"))
				itr.remove();
			
		}
		System.out.println(l);
	}

}
