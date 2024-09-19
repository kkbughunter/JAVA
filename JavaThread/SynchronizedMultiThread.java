
class Printer{
    // synchronized Method
    synchronized void printDocument( int numOfPrint,String docName ){
        for(int i =1; i<=numOfPrint; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("@@ Printing " + docName + " #" + i);
        }
    }

}

class MyThread extends Thread{

    Printer ref;
    
    MyThread(Printer p){
        ref = p;
    }

    @Override
    public void run() {
        ref.printDocument(10, "Karthieyan_Resume.pdf");    
    }
}


class YourThread extends Thread{

    Printer ref;
    
    YourThread(Printer p){
        ref = p;
    }

    @Override
    public void run() {
        ref.printDocument(10, "Main_Resume.pdf");    
    }
}
class TheirThread extends Thread{

    Printer ref;
    
    TheirThread(Printer p){
        ref = p;
    }

    @Override
    public void run() {
        ref.printDocument(10, "Lakshmi_Resume.pdf");    
    }
} 
public class SynchronizedMultiThread {
    public static void main(String[] args) {
        
        Printer printer = new Printer();

        MyThread myThread = new MyThread(printer);
        YourThread yourThread = new YourThread(printer);
        TheirThread theirThread = new TheirThread(printer);

        myThread.start();
        yourThread.start();
        theirThread.start();
    }
}
