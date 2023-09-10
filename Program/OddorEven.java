import java.util.Scanner;
public class OddorEven {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println(x + " is an Even Number...");
        }
        else{
            System.out.println(x + " is an Odd Number...");
        }
    }
}
