import java.util.*;

public class InputOutput{
	// if we declare the variable outside the method it will initializ with empty value.
	static String name;
	static int age;

	static public void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// make sure you have initialized with some value
		double mark = 0;
		boolean status = false;

		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
		System.out.println("Mark: " + mark);
		System.out.println("Marital Statis: " + status);

		System.out.print("\nEnter Your Name: ");
		name = sc.nextLine();
		System.out.printf("Enter your Age: ");
		age = sc.nextInt();
		System.out.printf("Enter your mark: ");
		mark = sc.nextDouble();
		System.out.printf("Enter your status: ");
		status = sc.nextBoolean();


		System.out.println("Hello " + name + ", Your age is " + age + " And Your Grade is " + mark + " Status " + status);
	}
}