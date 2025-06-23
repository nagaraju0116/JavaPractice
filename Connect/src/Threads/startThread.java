package Threads;

class Ant extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hi");
	/*
	 * try { //to delay the thread // checked exception Thread.sleep(10); } catch
	 * (InterruptedException e) { e.printStackTrace(); }
	 */
	}
}
class Ballon extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Hello");
	}
	
}
public class startThread {

	public static void main(String[] args) {
		Ant obj =new Ant();
		Ballon obj2 = new Ballon();
		
		
		//obj.run();
		obj.start();
		

		//obj2.run();
		obj2.start();
		//delaying for A obj (Hi) 
		obj.setPriority(Thread.MAX_PRIORITY);
	}

}

/*
*
*basically start() method create new thread and makes run() it
*
*
*
*/
