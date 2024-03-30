package javaprogramI;

public class JavaVariables {

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
		
//		System.out.println("Hi, My Name is " + name + " iam " + age + " Years old. Iam "
//				+ height + "cm Height and my salary is "+ salary + " and my Marital Status is " 
//				+ maritalStatus); // ERROR-variable not initialized.
		
		
//		The below are the example for variable value assignment. 
		name = "Karthikeyan";
		age = 19;
		height = 167.5f;
		salary = 1_00_000;
		maritalStatus = false;
		
		System.out.println("Hi, My Name is " + name + " iam " + age + " Years old. Iam "
				+ height + "cm Height and my salary is "+ salary + " and my Marital Status is " 
				+ maritalStatus);
		
		
	}

}
