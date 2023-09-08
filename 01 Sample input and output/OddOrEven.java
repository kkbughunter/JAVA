import java.util.Scanner;

public class OddOrEven{
    public static void main(String[] argc){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check Odd or Even: ");
        number = sc.nextInt();
        if(number<0){
            System.out.println("The Entered value is negative");
        }
        else if (number == 0){
            System.out.println("The given number is Even");
        }
        else if((number%2) == 0){
            System.out.println("The given number " + number + " is Even");
        }
        else{
            System.out.println("The given number " + number + " is Odd");
        }
    }
}