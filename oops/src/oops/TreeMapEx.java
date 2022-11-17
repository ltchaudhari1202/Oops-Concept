package oops;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, Integer>tm=new TreeMap<>();
		tm.put(1, null);
		tm.put(2, 1);
		tm.put(3, null);
		tm.put(4, 1);
		tm.put(5, 2);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		SortedMap<Integer,Integer>sm=tm.headMap(3);
		SortedMap<Integer, Integer>sm1=tm.tailMap(3);
		System.out.println(sm);
		System.out.println(sm1);
		System.out.println(tm.size());
		SortedMap<Integer,Integer>sm2=tm.subMap(2, 4);
		System.out.println(sm2);
	}

}
