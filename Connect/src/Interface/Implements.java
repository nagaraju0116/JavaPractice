package Interface;



interface Computer{
	
	//public abstract void compiler();
	
	void compiler();
	/* for interface class by default method is public abstract method
	 * 
	 *  */
}
//for interface we use implements 
class Desktop implements Computer{
	
	  public void compiler() { System.out.println("compiling. desktop.."); }
	 
}

class Laptop implements Computer{
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
public class Implements {

	public static void main(String[] args) {
		
		Computer lap = new Laptop();
		 Computer desk1 = new Desktop();
		Dev dev1 =new Dev();
		
		dev1.code(lap);
		dev1.code(desk1);
		
		
	}

}

