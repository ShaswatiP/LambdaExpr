package LambdaWithThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnonymousBasicRunnable  {

	public static void main(String[] args) {
		BaiscRunnable runnable = new BaiscRunnable();
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("Main thread");

		//below is an example of anonymous class that implements Runnable interface
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Child thread - anonymous Runnable");
			}
			
		};
		// anonymous runnable object passed to thread
		Thread t1 = new Thread(r);
		t1.start();
	
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Child thread - anonymous Runnable approach - 2");
				
			}
			
		}) ;
		t2.start();
		
	}

}

class BaiscRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Child thread - BasicRunnable");
	}	
	
}
