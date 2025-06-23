package Connect;

public class test {

	public static void main(String[] args) {
		/* declaring variable */
		int num ;
		/*Initializing variable*/		
		num =5;
		/* num is a primitive variable */
		
		keyboard obj;
			obj = new keyboard();
		obj.clicked();
		obj.throwIt();
		
	}

}

class keyboard{
	//instance variables
	/*
	 * int keys;
	 *  String colour;
	 */
	 
	
	//local variables
	 int keys=190; 
	  String colour="red";
	   
	 
	public void clicked() {
		System.out.println("data sent "+colour);
		
	}
	public void throwIt() {
		
		System.out.println("throw it ");
		//keys won't take 190 because we mentioned 100 below as like final
		keys=100;
	}
}
