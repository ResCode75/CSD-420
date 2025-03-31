//Rachel Shaw - 3/28/2025 - module 2 assignment (write program)
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class Shaw2_2write {
    public static void main(String[] args){
     
        try {
            //create filewriter object for data.file with append set to true (it will add to existing file)
            FileWriter testFileWrite = new FileWriter("C:\\csd\\csd-420\\module-2\\rachel.dat", true);
        
            Random random = new Random();
            
            //create Printwriter object for testfile object
            try (PrintWriter write = new PrintWriter(testFileWrite)) {
                //write integers to file
                for(int i = 1; i <= 5; i++){
                    int randomNum = random.nextInt(100);
                    write.print(randomNum + " ");
                }

                
                //write doubles to the file
                for(int j = 1; j <= 5; j++){
                    double randomDbl = (random.nextInt(1000)/100.00);
                    write.print(randomDbl + " ");
                }

            }
        }
        catch (IOException e) {
            System.out.println("oh no something went wrong:(");
        }
    
            

    }
}
