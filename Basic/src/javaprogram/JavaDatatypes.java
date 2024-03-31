package javaprogram;

public class JavaDatatypes {

	public static void main(String[] args) {
		System.out.println("...Java Primitive Datatypes...");
		byte b = 127;
		System.out.println("Byte Type: " + b);
		short s = 32_767;
		System.out.println("Short Type: "+s);
		int i = 2147483647;
		System.out.println("Int Type: "+i);
		long l = 9_223_372_036_854_775_807l;
		System.out.println("Long Type: "+l);
		float f = 1.7976931348623157E30f;
		System.out.println("Float Type: "+f);
		double d = 1.7976931348623157E+308;
		System.out.println("Double Type: "+d);
		boolean bol = true;
		System.out.println("Boollean Type: "+bol);
		char c = 65535;  
		System.out.println("Character Type: "+c);
		
		System.out.println("\n\nJava Reference Type");
		Integer ri = 2147483647; // Integer wrapper class is also allow limited size that's why the have Integer, Long Wrapper classes in java.
		System.out.println("Object Integer: " + ri);
		Integer ri1;
		ri1 = 20;
		System.out.println("Object Integer: "+ri1);
		Integer ri2 = new Integer(203); // The constructor Integer(int) has been deprecated since version 9 and marked for removal.
		
		System.out.println("Integer Object: "+ri2);
		ri2 = (Integer) i;
		System.out.println("Int to Integer Casting: "+ ri2);
		Byte rb = 127;
		System.out.println("Byte Type: " + rb);
		Short rs = 32_767;
		System.out.println("Short Type: "+rs);
		Integer wri = 2147483647;
		System.out.println("Int Type: "+wri);
		Long rl = 9_223_372_036_854_775_807l;
		System.out.println("Long Type: "+rl);
		Float rf = 1.7976931348623157E30f;
		System.out.println("Float Type: "+rf);
		Double rd = 1.7976931348623157E+308;
		System.out.println("Double Type: "+rd);
		Boolean rbol = true;
		System.out.println("Boollean Type: "+rbol);
		String str = "Hello";  
		System.out.println("Character Type: "+str);
		
	}
}
