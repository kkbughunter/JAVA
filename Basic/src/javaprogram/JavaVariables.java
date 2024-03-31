package javaprogram;

public class JavaVariables {
	
	static int persionId; // no need to initialize the value for the variable that is outside the class function.
	static String state;  // default value is null.
	
	public static void main(String[] args) {
		System.out.println("...Java Variables...");
//		In java, Variable have a type.
//		<variable Type> variable name;
//		The below are the example for variable declaration.
		String name;			// ERROR-variable not initialized.
		int age;				// ERROR-variable not initialized.
		float height;			// ERROR-variable not initialized.
		double salary;			// ERROR-variable not initialized.
		boolean maritalStatus;  // ERROR-variable not initialized.

		System.out.println(persionId);
		System.out.println(state);
//		System.out.println("Hi, My Name is " + name + " iam " + age + " Years old. Iam "
//				+ height + "cm Height and my salary is "+ salary + " and my Marital Status is " 
//				+ maritalStatus); // ERROR-variable not initialized.
		
		
//		The below are the example for variable value assignment. 
		name = "Karthikeyan";
		age = 19;
		height = 167.5f;
		salary = 1_00_000;
		maritalStatus = false;
		
		state = "Happy";
		
		System.out.println("Hi, My Name is " + name + " iam " + age + " Years old. \nIam "
				+ height + "cm Height and my salary is "+ salary + "LPA \nand my Marital Status is " 
				+ maritalStatus + "\nNow iam so "+ state);
		
		
	}

}
