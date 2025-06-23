package Connect;

class Mobile{
	String brand;
	int price;
	//name is taken as static (static key word)
	static String name;
	
	static {
		name="Wphone";
		System.out.println("in static block");
	}
	
	
	public Mobile() {
		brand=" ";
		price=200;
		System.out.println("in constructor");
	}
	public void show() {
		System.out.println(name+":"+price+":"+brand);
	}
	
	
}
public class Static {

	public static void main(String[] args) {
		
		//Class.forName("Mobile");
		Mobile obj=new Mobile();
		
		Mobile.name ="smartphone";
		
		obj.price=12000;
		obj.brand="iphone";
		
		Mobile obj1=new Mobile();
	
		Mobile.name ="foldphone";
		
		obj1.price=14000;
		obj1.brand="samsung";
		
		//it's a static varaible constant for the class
		//static varaible called by class name  not by refernce varaiable
		Mobile.name="zphone";
		
		
		obj.show();
		obj1.show();
		
		
				}

}

//class loads (once)and objs are instantrated
