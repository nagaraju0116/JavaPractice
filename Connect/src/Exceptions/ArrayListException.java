package Exceptions;

public class ArrayListException {

	public static void main(String[] args) {
		
		int i=4;
		int j=5;
		
		int result=0;
		
		int nums[] = {2,3,4};
		//gets exception as ArrayIndexOutOfBoundsException
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
	at Connect/Exceptions.ArrayListException.main(ArrayListException.java:14)
*/
		//System.out.println(nums[4]);
		
		try {
			//arithmetic exception
			result=i/j;
			if(result==0) {
				throw new ArithmeticException();
			//System.out.println(nums[4]);
			}
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException d");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException A");
		}catch(Exception e) {
			System.out.println("Exception ");
		}
		//finally used to close the statements to know
		//aftr try- catch only need to add finally if work or not closing is needed
		finally {
			System.out.println("Bye ");
		}
		
		System.out.println(result);
	}

}
