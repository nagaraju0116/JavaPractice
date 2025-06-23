package Threads;

class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("Hi");
		
	}
}
class B extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("Hello");
	}
	
}
public class threads {

	public static void main(String[] args) {
		A obj  = new A();
		B obj2 = new B();
		
		//int i=7/0;
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Connect/Threads.threads.main(threads.java:22)
	*/
		obj.run();
		
		obj2.run();
		
	}

}

/*
 * 
 * mostly main thread works so we can make parallel work by extend thread for A and B class and method was run()
*/
