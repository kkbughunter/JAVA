
class DeamonHelper implements Runnable{

    @Override
    public void run(){
        int count = 0;
        while(count < 500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("Deamon Thread Count:" + count);
        }
        System.out.println("Deamon Thread Ended");
    }
}

class UserThreadHelper implements Runnable{

    @Override
    public void run(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Iam User Thread iam iam Ending my Job");
    }
}

public class DeamonThreadExample {
    public static void main(String[] args) {
        Thread bgThread = new Thread(new DeamonHelper());
        Thread userThread = new Thread(new UserThreadHelper());
        bgThread.setDaemon(true);
        bgThread.start();
        userThread.start();
    }
}
