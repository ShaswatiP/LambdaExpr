package lambda;

// operation is implemented using lambda expressions
interface FuncInter1 {
	int operation(int a, int b);
}

// sayMessage() is implemented using lambda expressions below
interface FuncInter2 {
	void sayMessage(String message);
}

//Java program to demonstrate working of lambda expressions
public class ALambdaBasicWithMultipleArguments {

	// Performs FuncInter1's operation on 'a' and 'b'
	// has interface type as a parameter
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}

	public static void main(String args[]) {
		// lambda expression for addition for two parameters
		// data type for x and y is optional.
		// This expression implements 'FuncInter1' interface
		FuncInter1 add = (int x, int y) -> x + y;

		// lambda expression multiplication for two
		// parameters This expression also implements
		// 'FuncInter1' interface
		FuncInter1 multiply = (int x, int y) -> x * y;
		
		// here the abstract functions called using lambda Function
		System.out.println("Addition is "+add.operation(1,3));
		System.out.println("multiplication is "+multiply.operation(1,3));

		// Creating an object of class to call operate() using
		// different implementations using lambda
		// Expressions
		ALambdaBasicWithMultipleArguments tobj = new ALambdaBasicWithMultipleArguments();

		// Add two numbers using lambda expression
		System.out.println("Addition is " + tobj.operate(6, 3, add));

		// Multiply two numbers using lambda expression
		System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

		// lambda expression for single parameter
		// This expression implements 'FuncInter2' interface
		FuncInter2 fobj = message -> System.out.println("Hello " + message);

		fobj.sayMessage("nitu");
	}
}