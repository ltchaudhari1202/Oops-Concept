package oops;
class A{
	
}

class StringDemo {
	static{
		System.out.println("this is without method");
	}
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("lokesh");
		sb=sb.append(" Chaudhari");
		System.out.println(sb.reverse());
		StringBuffer sb2=new StringBuffer("Lokesh Chaudhari");
		sb2.insert(6, " Tukaram");
		System.out.println(sb2+":sb2");
		
		StringBuffer sb1=new StringBuffer("lokesh");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		String s=new String("Lokesh");
		String ss=new String("Lokesh");
		System.out.println(s.equals(ss));
		System.out.println(s==ss);
		String s1 = new String("you cannot change me!");
		s1=s1.concat("Hello lokesh");
		System.out.println("s1 concat: "+s1);
		String s2 = new String("you cannot change me!");
		s1=s1+"hey prabhu bachao muje iss moh maya se";
		
		System.out.println(s1);
		System.out.println(s1 == s2);// false
		String s3 = "you cannot change me!";
		s1=s1.intern();
		s2=s2.intern();
		System.out.println(s1 == s2);// true because it points to refrence to string pull
		System.out.println(s1 == s3);// false
		String s4 = "you cannot change me!";
		System.out.println(s3 == s4);// true because it already store in string literals
		String s5 = "you cannot " + "change me!";
		System.out.println(s5);
		System.out.println(s3 == s5);// true
		String s6 = "you cannot ";
		String s7 = s6 + "change me!";
		System.out.println(s7);
		System.out.println(s3 == s7);// false
		final String s8 = "you cannot ";
		final String s9 = s8 + "change me!";
		System.out.println("String s9: "+s9);
		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true
	}
}