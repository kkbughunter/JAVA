// Q: Write a Java program to accept two number from the
// user and calculate the average.
import java.util.Scanner;

public class CalculateAverage{
    
    public static void main(String[] args){
        double a, b, sum=0, average=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        a = sc.nextDouble();
        System.out.print("Enter the value of B: ");
        b = sc.nextDouble();
        sum = a + b;
        average = sum / 2;
        System.out.println("Average="+average);
    }
}