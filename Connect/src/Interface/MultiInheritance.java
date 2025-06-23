package Interface;

interface Computer1{
	//in interface we can create varaibles
	//by default every varaible is a final need to mention value
	int price=12300;
	//by default every variable in interface are final and static as well
	void compiler();
	//in java 8, for create method in interface need to mention default key word
	default void config() {
		
	}
	
}
interface Portable1{
	
	void move();
	
}
class Desktop1 implements Computer1{
	
	  public void compiler() { 
		  System.out.println("compiling. desktop..");
		  }
	 
}

class Laptop1 implements Computer1,Portable1{
	public void compiler() {
		System.out.println("compiling. laptop..");
	}
	//we need to mention method of Portable otherwise shows error for Laptop class
	public void move() {
		System.out.println("moving..");
	}
}

class Dev1{
	
	public void code(Computer1 lap) {
		
		System.out.println("Coding..");
		
		lap.compiler();
		
	}
}

class  MultiInheritance {

	public static void main(String[] args) {
		 Dev1 dev1 =new Dev1();
		 
		Computer1 lap1 = new Laptop1();
		dev1.code(lap1);
		
		Computer1 desk11 = new Desktop1();
		dev1.code(desk11);
		
		System.out.println(Computer1.price);
	}

}

