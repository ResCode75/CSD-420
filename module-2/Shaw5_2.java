import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.File;


public class Shaw5_2 {
    
    public static void main(String[] args){

        TreeSet<String> ascending = new TreeSet();
        
        try (FileReader FileRead = new FileReader("collection_of_words.txt")){
            //Scan the document and print it to the terminal
            try (Scanner reader = new Scanner(FileRead)) {
                while (reader.hasNext()){
                    ascending.add(reader.next());
                }
            }
            
            System.out.println("-- COLLECTION OF WORDS ASCENDING --");
            Iterator<String> it = ascending.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            
            System.out.println("-- COLLECTION OF WORDS DESCENDING --");
            int size = ascending.size();
            for(int i = 0; i < size; i++){
                System.out.println(ascending.pollLast());
            }
            
            
            

        }
        catch (IOException e) {
            System.out.println("oh no something went wrong :(");
        }
        
    }

}
