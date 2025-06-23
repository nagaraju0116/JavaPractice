package JaVa;



public class JVM {

	public static void main(String args[]) {
		//main mthod as its own stack
		
		int num= 9;
		//primitive variable = num
		
		keyboards1  obj = new advanceKeyboard();
		//reference variable  = obj
		keyboards1  obj1 = new advanceKeyboard();
		//obj.pressed();
		obj.throwIt();
		obj1.throwIt();
		
		System.out.println(keyboards1.brand);
		
	}
}

class keyboards1{
	
	   int keys; 
	   String colour;
	   //instance variable  has copy in heap memory
	   //but local varaible goes to stack memory
	   static String brand="Apple";
		/* if static varaiable as access we can use class name directly
		 * if method is static no obj needed as e.g: public static void main --no obj needed 
		 *  this static varaiables store in other memory location
		 *  
		 *  */
	
				public void throwIt() {
					
					System.out.println("throw it :");
					
				}
				
				
		
	} 


	class advanceKeyboard extends keyboards1 {
		
		
		public void throwIt() {
			
			int angle =87;
			System.out.println("throw it hard "+angle);
			}
	}


 
	
		/*Main method
		 * stack memory	(fixed)					heap memory 
		 * 							  ------------
		 * obj1 | 103 				  |	keys	  |
		 *  obj | 101 				  |	colors	  | ---> same
		 *  num | 9				   	  |-----------|
		 *  						  | presses() |	
		 *  						  | throwit() |---->same 
		 *  						  |-----------|
		 *  						  | 103		  |----->101
		 *  stack memory	
		 *  throw it 
		 *  angle | 87
		 */				

