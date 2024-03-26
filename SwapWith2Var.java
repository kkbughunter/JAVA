public class SwapWith2Var {
	public static void main(String[] args) {

		int a = 10;
		int b = 23;

		a = a + b;
		System.out.println("Value of A: " + a);
		b = a - b;
		System.out.println("Value of B: " + b);
		a = a - b;
		System.out.println("Final Value: A = " + a + " B = " + b);

	}
}