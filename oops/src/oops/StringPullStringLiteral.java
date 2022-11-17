package oops;

public class StringPullStringLiteral {
	public static void main(String[] args) {
		String s2="lokesh";
		String s1=new String("lokesh");
		System.out.println(s1==s2);
		s1=s1.intern();
		System.out.println(s1==s2);
		String s=new String("bhaskar"); 
		s.concat("software"); 
		s=s.concat("solutions"); 
		s="bhaskarsoft";
		System.out.println(s);
		String s3=new String("spring"); 
		s3.concat("fall"); 
		s3=s3+"winter"; 
		String s4=s3.concat("summer"); 
		System.out.println(s3); 
		System.out.println(s4);
	}

}
