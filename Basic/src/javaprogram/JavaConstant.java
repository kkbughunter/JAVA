package javaprogram;

public class JavaConstant {

	public static void main(String[] args) {

		final float PRICE=39_999.85f;
//		PRICE++;   // local variable PRICE cannot be assigned
		System.out.println("The Price of the CORE JAVA Course is "+PRICE);
		
		final String CAR_NUMBER;
		CAR_NUMBER = "TN74AB4570";		// It is mandatory to assign a value for the final or constant variable
		// or you will get ERROR-CAR_NUMBER may not have been initialized
		System.out.println("My Car Number is " + CAR_NUMBER);
		
	}

}
