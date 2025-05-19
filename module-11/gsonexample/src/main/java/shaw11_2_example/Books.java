/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package shaw11_2_example;

/**
 *
 * @author Rache
 */
public class Books {
    private String title; 
   private String author; 

   public Books(){} 
   
   public String getTitle() { 
      return this.title; 
   } 
   public void setTitle(String title) { 
      this.title = title; 
   } 
   public String getAuthor() { 
      return this.author;
   } 
   public void setAuthor(String author) { 
      this.author = author; 
   } 

   @Override
   public String toString() { 
      return "Book [ name: "+this.title+", age: "+ this.author+ " ]"; 
   }  
}
