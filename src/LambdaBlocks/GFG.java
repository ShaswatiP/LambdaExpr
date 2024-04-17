package LambdaBlocks;

//Java Program to illustrate Lambda expression



//Interface
//If1 is name of this interface
interface If1 {

	// Member function of this interface
	// Abstract function
	boolean fun(int n);
}

//Class
class GFG {

	// Main driver method
	public static void main(String[] args) {
		// Lambda expression body
		If1 isEven = (n) -> (n % 2) == 0;

		// Above is lambda expression which tests
		// passed number is even or odd

		// Condition check over some number N
		// by calling the above function
		// using isEven() over fun() defined above

		// Input is passed as a parameter N
		// Say custom input N = 21
		if (isEven.fun(21))

			// Display message to be printed
			System.out.println("21 is even");
		else

			// Display message to be printed
			System.out.println("21 is odd");
	}
}
