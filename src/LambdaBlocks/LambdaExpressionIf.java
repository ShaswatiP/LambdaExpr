package LambdaBlocks;

//Interface
//Functional interface named 'New'
interface New {

	// Boolean function to check over
	// natural number depicting calendar year

	// 'n' depicting year is
	// passed as a parameter
	boolean test(int n);
}

//Class
//Main class
public class LambdaExpressionIf {

	// Main driver method
	public static void main(String[] args)
	{
		// block lambda
		// This block lambda checks if the
		// given year is leap year or not
		New leapyr = (year) ->
		{
			// Condition check
			// If year is divisible by 400 or the
			// year is divisible by 4 and not 100
			if (((year % 400 == 0)
				|| (year % 4 == 0) && (year % 100 != 0)))

				// Returning true as year is leap year
				return true;
			else

				// Returning false for non-leap years
				return false;
		};

		// Calling lambda function over
		// custom input year- 2020

		// Condition check using the test()
		// defined in the above interface
		if (leapyr.test(2020))

			// Display message on the console
			System.out.println("leap year");
		else

			// Display message on the console
			System.out.println("Non leap year");
	}
}
