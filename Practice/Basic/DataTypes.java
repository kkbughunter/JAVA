public class DataTypes {
    public static void main(String[] args) {

        // Integer DataType
        byte mark = 100; // -128 to 127
        short carNumber = 3849; // -32,768 to 32,767
        int salaryAmount = 338000000; // -2147483648 to 2147483647
        long searchResult = 383495859594l; // -9223372036854775808 to 9223372036854775807

        // Decimal DataType
        double bitcoinValue = 41885.7438486700000009; // 4.9E-324 to 1.7976931348623157E308
        float cutOff = 198.23f; //1.4E-45 to 3.4028235E38

        // booleans
        boolean result = true; // true or false

        // Character more:- https://litux.nl/Books/Books/www.leothreads.com/e-book/oreillybookself/java/javanut/ch11_02.htm
        char smileyFace = '\u263A'; // unicode 
        System.out.println("My Smiley Face " + smileyFace);
    }
}
