import java.util.Scanner;

public class InputOutput {
    public static void main(String[] argc){
        System.out.println("Hello welcome to Java Programming..."); 
        System.out.print("Hello JAVA..\n");
        System.out.printf("This is Integer: " + 20 + " \n");
        System.out.println("This is Flating point: " + 43.4534);
        System.out.println("This is String: " +  "JAVA");
        System.out.println("This is Boolean: " + true);

        // read input from user
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("Enter the value of A: ");
        a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum of A and B: " + c );
    }
}
