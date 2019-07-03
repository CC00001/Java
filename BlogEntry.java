//associate with Exercise3_2.java
import java.util.Scanner;
import java.util.Date; //Java build in Date class library

//class Exercise3_2{

 class BlogEntry{
  private String username;
  private String text; 
  Date date = new Date();
   
  //Constructor
  public BlogEntry(String user, String t){
   username = user;
   text = t;
  }
  
   //getters
   public String get_username(){
    return username;
   }

   public String get_text(){
    return text;
   }
  
   //Display Methods
   public void DisplayEntry(){
    System.out.println(get_username());
    System.out.println(get_text());
    System.out.println(date);
   }

   public void getSummary(String text){
    if(text.length() < 10)
    System.out.println(get_text());
    else if(text.length() >=10)
    System.out.println(text.substring(0, 10));
   }
   
   //toString method to Display the object
   public String toString(){
    return ("Username is " + username + ", Text: " + text + ", and the date is " + date);
   }

 }

