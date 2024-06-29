import java.util.*;

public class Main{
	public static void printf(String str){
		System.out.println(str);
	}
	public static void main(String[] args){

		String str1 = new String("Sam");
		String str2 = "Sam";
		if(str1.equals(str2))
			System.out.println("equal");
		else
			System.out.println("Not equal");

	}
}
