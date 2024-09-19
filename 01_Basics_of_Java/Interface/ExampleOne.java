
interface PaymentProcess{
    int paymentId = 21;
    String name = "karthikeyan";
    float totalAmount = 5000;

    void printDetails();
}

class PaymentInfo implements PaymentProcess{
    int paymentProcessTime = 10;


    @Override
    public void printDetails() {
        System.out.println(paymentId);
        System.out.println(name);
        System.out.println(totalAmount);
        System.out.println(paymentProcessTime);
    }

}


public class ExampleOne{

    public static void main(String[] args) {
        PaymentInfo pp = new PaymentInfo();

        pp.printDetails();
    }
}