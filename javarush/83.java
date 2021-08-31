import java.io.*;
import java.util.Arrays;
 
public class Program {
  
    public static void main(String[] args) {
          
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){
                 
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }       
    }     
}
