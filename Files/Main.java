import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        File file = new File("input.txt");
        
        // Open File
        try{
            if(file.createNewFile())
                System.out.println("File Created " + file.getName());
            else
                System.out.println("File already exists.");
            }
        catch(IOException e){
            System.out.println("ERROR in File handling");
        }
        
        // Read File
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            
        }   
        catch(IOException e){
            System.out.println("ERROR: File can't able to Read");
        }
        
        // Write to File
        try{
            FileWriter wri =  new FileWriter("input.txt");
            wri.write("This is the new content to the file");
            wri.close();
        }
        catch(IOException e){
            System.out.println("ERROR: file con't open");
        }
    }    
}
