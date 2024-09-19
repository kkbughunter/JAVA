class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class RunMethodExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run(); // `run()` executes in the current thread (main thread)
        System.out.println("Main thread");
    }
}
