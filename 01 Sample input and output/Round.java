import java.util.Scanner;
public class Round {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.print("Enter the Number: ");
        num = sc.nextFloat();
        int number = Math.round(num);
        System.out.println(number);
    }
}
