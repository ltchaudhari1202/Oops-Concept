package oops;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		LinkedList<Integer>ll=new LinkedList<>();
		Vector<Integer >v=new Vector<>();
		al.add(1);
		al.add(2);
		al.add(null);
		System.out.println(v instanceof Serializable);
		System.out.println(v instanceof Cloneable);
		System.out.println(v instanceof RandomAccess);
//		System.out.println(al instanceof Serializable);
//		System.out.println(al instanceof Cloneable);
//		System.out.println(al instanceof RandomAccess);
//		System.out.println(ll instanceof Serializable);
		System.out.println(al.lastIndexOf(1));
		System.out.println(al);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i.equals(1))
			{
			itr.remove();
			}
		}
		System.out.println(al);
	}

}
