package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main (String[] args) {
		// Function takes 1 argument and produces 1 result
		int icr = incrementByOne(1);
		System.out.println(icr);
		
		
		int increment2 = increamentByOneFunction.apply(1);
		System.out.println(increment2);
		
		Function<Integer, Integer> mulicrnunber = increamentByOneFunction.andThen(multiplyBy10);
		
		System.out.println(mulicrnunber.apply(1));
		
		// BiFunction takes 2 argument's and produces 1 result
		System.out.println(incrementByOneAndMultiply(4,100));
		System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
		
		
		
	}
	// How to do
	
	static Function<Integer, Integer> increamentByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = 
			(numberToIncrementByeOne, numberToMultiplyBy) -> (numberToIncrementByeOne + 1) * numberToMultiplyBy;
	
	
	// How not to do 
	
	static int incrementByOneAndMultiply(int num, int numToMult) {
		return (num + 1) * numToMult;
	}
	
	static int incrementByOne(int num) {
		return num + 1;
	}
}
