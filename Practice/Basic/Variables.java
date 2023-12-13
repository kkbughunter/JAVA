// https://google.github.io/styleguide/javaguide.html

class Variables {
    static int updated_age;
    public static void main(String[] args){
        int age;  // Variable Declaration.
        age = 19; // value assignment.
        System.out.println("Iam " + age + " Years old."); 
        System.out.println("my age in next year is: " + updated_age); 

        int _car = 4593;
        int $price = 4999;
        System.out.println("My car Number is: " + _car);
        System.out.println("My Car price is " + $price + "$");

        // Naming Conventions
        int carPrice; // camel case   used in cariable naming
        int car_price; // snake case   used in function naming 
        int CarDetails; // pascal case    used in class naming 

    }
}
