//Rachel Shaw - 3/28/2025 - module 2 assignment (read program)
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Shaw2_2read {
    public static void main(String args[]){
        //create file reader object for data.file
        try (FileReader FileRead = new FileReader("C:\\csd\\csd-420\\module-2\\rachel.dat")){
            //Scan the document and print it to the terminal
            try (Scanner reader = new Scanner(FileRead)) {
                while (reader.hasNext()){
                    System.out.print(reader.next() + " ");
                }
            }

        }
        catch (IOException e) {
            System.out.println("oh no something went wrong:(");
        }
        
    }
}
