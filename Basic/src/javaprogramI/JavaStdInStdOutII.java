package javaprogramI;

import java.util.Scanner;

public class JavaStdInStdOutII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		double b;
		String c;
		
		a = sc.nextInt();
		b = sc.nextDouble();
		sc.nextLine();
		c = sc.nextLine();

		System.out.println("String: " + c);
		System.out.println("Double: " + b);
		System.out.println("Int: " + a);
	
	
	}
}
