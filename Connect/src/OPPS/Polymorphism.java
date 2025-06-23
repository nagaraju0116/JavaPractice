package OPPS;


	class keyboards1{
	
	   int keys; 
	   String colour;

			 
	/*
	 *  this is compile-time Polymorphism(multiple methods in same class)method overloading ,
	 *   while passing mentioned parameter calls throwIt(int keys)  
	 *   if not mentioned calls throwIt()
	 */	//{
				public void throwIt() {
					
					System.out.println("throw it :");
					
				}
				
				public void throwIt(int keys) {
					
					System.out.println("throw it keys :"+keys);
					
				}
		//}
	} 


	class advanceKeyboard extends keyboards1 {
		/*
		 *  this is run-time Polymorphism(same methods in multiple class)method overriding ,
		 *  from keyboards1 to advanceKeyboard of throwIt()
		 */	
		
		public void throwIt() {
			System.out.println("throw it hard adv");
			}
	}

	public class Polymorphism {

			public static void main(String[] args) {
				
				
				/*
				 * Polymorphism (run-time ploymorphism) is happens at inheritance it takes
				 * object based on class mentioned at new
				 */
				keyboards1 obj;
				obj = new advanceKeyboard();
				
				obj.throwIt();
				obj.throwIt(3 );
				
				
			}

	}


