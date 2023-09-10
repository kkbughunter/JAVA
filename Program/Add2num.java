import java.util.Scanner;

public class Add2num {
    public static void main(String[] argc){
        Integer a;
        Integer b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        a = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        b = sc.nextInt();

        System.out.println("Sum of 2 Number is: " + (a + b));
    }
}
