package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class ArrayDemo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	List l=Collections.synchronizedList(al);
	for(int i=1;i<=10;i++) {
		al.add(i);
	}
	al.remove(1);
	al.forEach(x->System.out.println(x));
	TreeMap tm=new TreeMap();
	tm.put(null, 1);
}
}
