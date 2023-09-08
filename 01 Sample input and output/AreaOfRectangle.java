import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int length;
        int width;
        int area;
        System.out.print("Enter the Value of length: ");
        length = sc.nextInt();
        System.out.print("Enter the Value of width: ");
        width = sc.nextInt();
        area = length * width;
        System.out.println("The Volume of Rectangle is : " + area);
    }
}
