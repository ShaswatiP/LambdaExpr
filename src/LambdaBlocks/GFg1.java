package LambdaBlocks;

//Java Program to illustrate Block Lambda expression

//Importing all classes from
//java.util package
import java.io.*;

//Block lambda to find out factorial
//of a number

//Interface
interface Func {
	// n is some natural number whose
	// factorial is to be computed
	int fact(int n);
}

//Main class
public class GFg1 {
	// Main driver method
	public static void main(String[] args)
	{
		// Block lambda expression
		Func f = (n) ->
		{
			// Block body

			// Initially initializing with 1
			int res = 1;

			// iterating from 1 to the current number
			// to find factorial by multiplication
			for (int i = 1; i <= n; i++)
				res = i * res;
			return res;
		};

		// Calling lambda function

		// Print and display n the console
		System.out.println("Factorial of 5 : " + f.fact(5));
	}
}
