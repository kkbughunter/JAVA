// Q: Write a Java program to accept two numbers from the
// user and calculate sum and product.

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a, b, sum, product;
        System.out.print("Enter the Value of A: ");
        a = sc.nextInt();
        System.out.print("Enter the Value of B: ");
        b = sc.nextInt();        
        sum = a + b;
        product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
