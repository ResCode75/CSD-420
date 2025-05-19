package shaw11_2_example;
import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;  


public class Main {
    public static void main(String[] args) {
        
        //create JSON strings
        String book1Json = "{\"title\":\"Little Women\", \"author\":\"Louisa May Alcott\"  }"; 
        String book2Json = "{\"title\":\"The Metamorphosis\", \"author\":\"Franz Kafka\"  }"; 
        
        GsonBuilder builder = new GsonBuilder(); 
        //format output in terminal
        builder.setPrettyPrinting();
        
        //convert books from JSON to java objects
        Gson gson = builder.create(); 
        Books book1 = gson.fromJson(book1Json, Books.class);   
        Books book2 = gson.fromJson(book2Json, Books.class);  
      
        //convert book objects to json 
        book1Json = gson.toJson(book1); 
        book2Json = gson.toJson(book2); 

        //print books
        System.out.println(book1Json);  
        System.out.println(book2Json);

       
    }
}