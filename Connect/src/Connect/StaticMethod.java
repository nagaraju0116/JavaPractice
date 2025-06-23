package Connect;

class Mobile1{
	String brand;
	int price;
	//name is taken as static (static key word)
	static String name;
	
	/*
	 * static { name="Wphone"; System.out.println("in static block"); }
	 */
	
	/*
	 * public Mobile() { brand=" "; price=200; System.out.println("in constructor");
	 * }
	 */
	public void show() {
		System.out.println(name+":"+price+":"+brand);
	}
	//static method 
	public static void show2(Mobile1 obj){
		System.out.println(name+" 1 :"+obj.price+" 1 :"+obj.brand);
	}
}
public class StaticMethod {

	
	//here static also there but its main mehtod no need to call StaticMethod class objs
	public static void main(String[] args) {
		
		//Class.forName("Mobile");
		Mobile1 obj=new Mobile1();
		
		Mobile1.name ="smartphone";
		
		obj.price=12000;
		obj.brand="iphone";
		
		Mobile1 obj1=new Mobile1();
	
		Mobile1.name ="foldphone";
		
		obj1.price=14000;
		obj1.brand="samsung";
		
		//it's a static varaible constant for the class
		//static varaible called by class name  not by refernce varaiable
		Mobile1.name="zphone";
		
		
		obj.show();
		obj1.show();
		
		Mobile1.show2(obj1);
				
	}

}

//class loads (once)and objs are instantrated
