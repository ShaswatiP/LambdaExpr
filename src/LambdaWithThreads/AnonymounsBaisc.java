package LambdaWithThreads;

public class AnonymounsBaisc {
	public static void main(String[] args) 
	{ 
		
		myThread mt = new myThread();
		mt.start();
		System.out.println("main thread");
		
		// below is an example of anonymous inner class - which replaces functionality of myThread class.
		// Here Thread created using anonymous inner class 
		Thread t1 = new Thread() {
			@Override
			public void run() {
				 System.out.println("child Thread - t1 - created using anonymous Inner class");
			}
		};
		t1.start();
		
	}
}
class myThread extends Thread{
	@Override
	public void run() {
		 System.out.println("Child Thread - myThread"); 	
	}
	
}
