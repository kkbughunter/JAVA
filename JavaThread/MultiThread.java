class Printer{

    void printDocument( int numOfPrint,String docName ){
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


public class MultiThread {
    public static void main(String[] args) {
        System.out.println("== Application Started ==");
        
        Printer printer = new Printer();

        MyThread myThread = new MyThread(printer);
        myThread.start();

        // Synchronized Multi Thread
        // try {
        //     myThread.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        YourThread yourThread = new YourThread(printer);
        yourThread.start();

        System.out.println("== Application Finished ==");
    }
}
