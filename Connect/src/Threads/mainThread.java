package Threads;

class Ant2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hi");
	
	}
}
class Ballon2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hello");
	}
	
}
public class mainThread {

	public static void main(String[] args) {
		Ant2 obj1 =new Ant2();
		Ballon2 obj2 = new Ballon2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//its run by main thread
		System.out.println("Bye");
		
	}

}

/*to keep main thread to hold and print at last we can use join() 
 * 
 * 
*/
