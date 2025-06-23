package JaVa;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		String s1 = new String("Apple");
		String s = "Apple";
		s=s+" Pro";
		
		System.out.println(s1);
		System.out.println(s);
	}

}

/*
 * stack memory	(fixed)					heap memory 
 * 							  ------------
 * s1 | 101 				101  |	Apple	  |
 *  s | 103 				 103 |	Apple Pro | ---> 
 *  s | 101				   	 
 *  							==========
 *  							String pool
 *  
 *  it stores with existing obj
 */			