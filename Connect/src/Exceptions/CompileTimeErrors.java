package Exceptions;

public class CompileTimeErrors {

	public static void main(String[] args) {
		//normal statment
		int i=4;
		int j=2;
		
		int results ;
		
		//critical statment  -this may get  errors
		results=i/j;
		
		System.out.println(results);
		System.out.println("Bye");
	}

}

/*
 * compile time errors   - code wrote error
 * 
 * logical error --code runs but output values not get exact we want
 * 
 * run time error -- works now but later don't
 */