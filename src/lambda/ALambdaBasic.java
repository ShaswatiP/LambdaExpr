package lambda;
// Java program to demonstrate lambda expressions to implement a user defined functional interface.

// A sample functional interface (An interface with a single abstract method
interface FuncInterface {
	
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun() {
		System.out.println("Hello");
	}
}

public class ALambdaBasic {

	public static void main(String args[]) {
		// lambda expression to implement above functional interface. This interface
		// by default implements abstractFun() and defines the function's body
		FuncInterface fobj = (int x) -> System.out.println(2 * x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}

}
