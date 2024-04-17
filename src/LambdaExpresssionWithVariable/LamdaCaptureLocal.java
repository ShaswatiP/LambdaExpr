package LambdaExpresssionWithVariable;

//Importing reqiored classes 
import java.io.*;

// An example of capturing a local variable from the 
// enclosing scope 

// Inrterface 
interface MyFunction {

	// Method inside the interface
	int func(int n);
}

// Main class
public class LamdaCaptureLocal {

	// Main driver method
	public static void main(String[] args) {

		// Custom local variable that can be captured -> this variable can't be modified inside lambda function
		int number = 10;

		MyFunction myLambda = (n) -> {

			// This use of number is OK It does not modify num
			int value = number + n;

			// However, the following is illegal because it
			// attempts to modify the value of number

			// number++;
			return value;
		};

		// The following line would also cause an error,
		// because it would remove the effectively final
		// status from num. 
		// we get error as Local variable number defined in an enclosing scope must be final or effectively final
		//number = 9;

		System.out.println("GFG!"+myLambda.func(number));
	}
}
