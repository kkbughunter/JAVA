import java.util.Scanner;
public class Stringlen {
    public static void main(String[] argc){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name to find length: ");
        name = sc.nextLine();
        System.out.println(name.length());
    }
}
