import java.util.Scanner;

public class TakeAUserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float CGPA;
        boolean status;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your CGPA: ");
        CGPA = sc.nextFloat();
        System.out.print("Have you complete your study(true/false): ");
        status = sc.nextBoolean();
        
        System.out.println("Hello " + name + "! i see your age is " + age + " and your CGPA is  " + CGPA + "/10");
        System.out.println("and your study status is : " + status);

    }
}