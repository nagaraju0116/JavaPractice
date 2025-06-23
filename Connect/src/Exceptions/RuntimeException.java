package Exceptions;

public class RuntimeException {

	public static void main(String[] args) {
		
		int i=4;
		
		int j=0;
		
		//run time error
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Connect/Exceptions.CompileTimeErrors.main(CompileTimeErrors.java:13)
*/
		int results = 0;
		
		//this line cause exception because of divided by zero
		//results=i/j;
		
		//trying to catch the eror
		try {
			results=i/j;
			System.out.println("try");
		}catch(Exception e){
			System.out.println("Somthing went wrong");
			//getting into catch block
		}
		
		
		System.out.println(results);
		System.out.println("Bye");
	}

}


