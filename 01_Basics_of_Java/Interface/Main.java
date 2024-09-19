public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread One: " + i);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread Two: " + i);
            }
        });

        System.out.println("before Executing the Threads.");
        one.start();
        one.join();
        two.start();
        two.join();
        System.out.println("Application End");
    }
}
