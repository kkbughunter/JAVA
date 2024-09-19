
class Thread1 extends Thread {
    @Override
    public void run() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println("^^ Printer 2 = Printing #" + i);
        }
    }
}

public class SimpleThread {

    public static void main(String[] args) {
        System.out.println("==  Application Started  ==");

        Thread1 t1 = new Thread1();
        t1.start();

        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(">> Printer 1 = Printing #" + i);
        }

        System.out.println("== Application End ==");
    }
}