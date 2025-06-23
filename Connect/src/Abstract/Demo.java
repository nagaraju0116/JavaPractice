package Abstract;

//computer is an abstract class for laptop and desktop
//for interface class by default method is public abstract method
abstract class Computer{
	
	public abstract void compiler();
	//we can use abstract method or other method
	/*
	 * public void compiler() 
	 * { 
	 * System.out.println("compiling. computer.."); 
	 * }
	 */
	/*
	 * 1.any class implement to abstract class need to
	 *  2. abstract class can't create obj to run 
	 *  3.the type Desktop must implement the inherited abstract method Computer.compiler()
	 */}
//extends used to abstract the computer
class Desktop extends Computer{
	
	  public void compiler() { System.out.println("compiling. desktop.."); }
	 
}
//extends used to abstract the computer
class Laptop extends Computer{
	public void compiler() {
		System.out.println("compiling. laptop..");
	}
}

class Dev{
	
	public void code(Computer lap) {
		System.out.println("Coding..");
		lap.compiler();
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Computer lap = new Laptop();
		 Computer desk1 = new Desktop();
		Dev dev1 =new Dev();
		
		dev1.code(lap);
		dev1.code(desk1);
		
		/*
		 * Computer class is type abstact error for computer () 
		 * we can't create abstract obj
		 */		
		//Computer com = new Computer();
	}

}
