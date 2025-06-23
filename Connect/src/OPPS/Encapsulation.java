package OPPS;


class keyboard1{
	//instance variables
	
	//making them private
	 private  int keys; 
	  private String colour;
	 
		/*
		 * for encapsulation making them instance variables in constr
		 */ 
	public keyboard1() {
		keys = 10;
		colour = "purple";
	}
	
	//added setr and getr for keys & colour
	public int getKeys() {
		return keys;
	}

	public void setKeys(int key) {
		this.keys = key;
		/*
		 * this.keys(instance) = key(local);
		 */	
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	
	public void clicked() {
		System.out.println("data sent = "+colour);
		
	}
	public void throwIt() {
		
		System.out.println("throw it ");
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		keyboard1 obj;
		obj = new keyboard1();
		
		obj.clicked();
		obj.throwIt();
		
		System.out.println("keyboard keys = "  +obj.getKeys());
		
		obj.setColour( "white");
		System.out.println("keyboard colour = "  +obj.getColour());
	}

}

