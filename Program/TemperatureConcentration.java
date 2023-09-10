import java.util.Scanner;
public class TemperatureConcentration {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.println("Fahrenheit to Celsius Concentration.");
        System.out.print("Enter the value of Fahrenheit: ");
        Float Fahrenheit = sc.nextFloat();
        System.out.println("Temperature in degress Fahrenheit is: " + ((Fahrenheit - 32) * 5/9) + "\u00B0C");

        
        System.out.println("Celsius to Fahrenheit Concentration.");
        System.out.print("Enter the value of Celsius: ");
        Float clesius = sc.nextFloat();
        System.out.println("Temperature in degress Fahrenheit is: " + (((clesius) * 9/2) + 32) + "\u00B0F");
    }
}
