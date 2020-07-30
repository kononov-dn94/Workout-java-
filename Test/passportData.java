import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class passportData {
    public static void main(String[] args) {
        String fileName = "passportData1.csv";
        File file = new File("fileName");
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()) {
                String data = inputStream.next();
                System.out.println(data);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
