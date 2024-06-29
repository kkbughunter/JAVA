// Q: Write a Java program to calculate the area of triangle
// using three sides.
import java.util.Scanner;

public class AreaOfTriangle{
    
    public static void main(String[] args){
        int a, b, c;
        double s, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 3 sides: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a + b + c)/2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the Triangle: " +  area);
        
    }
}