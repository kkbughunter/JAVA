

class Doctor{
    void whoAmI(){
        System.out.println("Iam Doctor");
    }
}

class EyeSpecialist extends Doctor implements Runnable{

    @Override
    public void run(){

        for(int i=1; i<=10; i++){
            System.out.println("@@ Eye Specialist work #" + i);
        }

        Doctor doc = new Doctor();
        doc.whoAmI();
    }

}


public class RunnableImp {
    public static void main(String[] args) {
        System.out.println("== Application Started ==");
        
        Runnable eyeSpecialist = new EyeSpecialist();
        Thread task = new Thread(eyeSpecialist);
        task.start();

        for(int i=1; i<=10; i++){
            System.out.println("^^ Doctors working #" + i);
        }
        System.out.println("== Application Ended ==");
    }
}
