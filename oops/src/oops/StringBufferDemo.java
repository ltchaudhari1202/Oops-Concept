package oops;

class StringBufferDemo

{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Lokesh");
		sb.append(" Chaudhari").insert(7, "Tukaram").delete(13, 17).reverse().append("solutions").insert(22, "abcdf")
				.reverse();
		System.out.println(sb);// 
	}
}