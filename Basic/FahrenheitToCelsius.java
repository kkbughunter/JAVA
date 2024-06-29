// Q: Write a java program to convert fahrenheit to celsius
// and celsius to Fahrenheit using formula        c =
// (5.0/9.0)*(f-32).
import java.util.Scanner;

public class FahrenheitToCelsius{
    
    public static void main(String[] args){
        double c, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit: ");
        f = sc.nextDouble();
        c = (5.0 / 9.0) * (f - 32);
        System.out.println("Temperature in Celsius: " + c); 
    }
}