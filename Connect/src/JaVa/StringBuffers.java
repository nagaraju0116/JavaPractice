package JaVa;

public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Iphone");
		s.append(" battery");
		//string buffer uses to add multiple strings
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println("leng"+s.length());
		System.out.println(s.charAt(2));
		//to delete in index
		System.out.println(s.deleteCharAt(3));
		//add string at index value
		System.out.println(s.insert(0, "new "));
		
	}
}



/*
 * string buffer is mutable  
 * string builder is immutable
 */