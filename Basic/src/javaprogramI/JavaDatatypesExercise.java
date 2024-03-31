package javaprogramI;

public class JavaDatatypesExercise {

	public static void main(String[] args) {
		int intValue = 10;
		System.out.println("Primitive type Int: " + intValue);
		Integer integerValue = intValue; // Autoboxing: converting a primitive type to its corresponding wrapper type.
		System.out.println("Reference type Integer: " + integerValue + " Autoboxing Done.");
		int intValueAgain = integerValue; // Unboxing: converting a wrapper type to its corresponding primitive type.
		System.out.println("Primitive type Int: " + intValueAgain + " Unboxing Done.");
		long longValue = integerValue; // Unboxing: Integer(wrapper class) to long.
		System.out.println("Primitive type long: " + longValue + " Unboxing Done.");

		// Problem
//		Integer integerValueAgain = longValue; // Type mismatch: cannot convert from long to Integer.
		// Solution
		Integer integerValueAgain = (int) longValue;
		System.out.println("Reference type Integer: " + integerValueAgain + " Autoboxing Done.");

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int lenArr = arr.length;
		System.out.println("Array length: " + lenArr);
		for (int i = 0; i < lenArr; i++)
			System.out.print(arr[i] + " ");

	}

}
