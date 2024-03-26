import java.util.*;

public class Swap{

	static int[] mySwap(int a, int b){
		a = a + b;
		b = a - b;
		a = a - b;

		return new int[] {a,b};
	}

	public static void main(String[] agrs){
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter the value of A: ");
		a = sc.nextInt();
		System.out.printf("Enter the value of B: ");
		b = sc.nextInt();

		System.out.println("\nBefore Swaping A: " + a + " B: " + b);
		int result[] = mySwap(a, b);
		System.out.println("After Swaping A: " + result[0] + " B: " + result[1]);

	}
}