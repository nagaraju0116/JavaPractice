package Connect;

class Add{
	//instance variable
	int num;
	//a,b are local variables because they are in method add()
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		
		Add ad = new Add();
		
  int e= ad.add( 2,  3);
  int f = ad.sub(4, 3);
   System.out.println("add " + e);
   System.out.println("sub "+f);
	}

}
