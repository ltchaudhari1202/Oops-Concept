package oops;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
}

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> h=new Hashtable<>();
		
		h.put(1,2);
		h.put(2, 3);
		h.put(4, 5);
		h.put(5, 5);
		System.out.println(h);
		System.out.println(h.hashCode());
		System.out.println(h.size());
		for(Map.Entry m:h.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		
		
	}

}
