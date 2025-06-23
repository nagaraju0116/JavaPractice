package Threads;

class Ant1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hi");
	
	}
}
class Ballon1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hello");
	}
	
}
public class RunnableThread {

	public static void main(String[] args) {
		Ant1 obj1 =new Ant1();
		Ballon1 obj2 = new Ballon1();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}

}

/*by extending thread other class can't add in extends
*so we can implement runnable class
* 
*runnable is interface of thread
*
*/
