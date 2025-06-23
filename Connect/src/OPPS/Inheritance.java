package OPPS;

public class Inheritance {

	public static void main(String[] args) {
		
		
		advKeyboard obj;
			obj = new advKeyboard();
		obj.clicked(); //keyboards obj  (advkeyboard extends keyboard)
		obj.throwIt();  //keyboards obj (advkeyboard extends keyboard)
		obj.hitNum();	//advKeyboards obj
		  
		System.out.println("keyboard keys = "  +obj.keys);
		
		
	}

}


class keyboards{
	
	 int keys=190; 
	  String colour="red";
	   
	 
	public void clicked() {
		System.out.println("data sent "+colour);
		
	}
	public void throwIt() {
		
		System.out.println("throw it ");
		
	}
}

//inheritance
/*
 * from parent(keyboards) to child extends(advKeyboard) 
 * also multi-level inheritance can take A extends B  and B extends C
 * multiple inheritance not exist in java
 */
  class advKeyboard extends keyboards{ 
	  
	public void hitNum() 
	  {
	  System.out.println("hit it ");
	  }
  }
 

