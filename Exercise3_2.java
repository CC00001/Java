//Associate with BlogEntry.java && Date.java

import java.util.Scanner;
//import java.util.Date;


class Exercise3_2{

 public static void main(String [] args){
 
  BlogEntry blog = new BlogEntry("Charles", "This is a test, that staring should be more the 10 characters.");
  System.out.println("Constructor with pass in strings");
  System.out.println(blog);
  System.out.println();
  System.out.println("DisplayEntry method to display all instance varaibles");
  blog.DisplayEntry();
  System.out.println();
  System.out.println("getSummary methods to display first 10 characters of the string");
  blog.getSummary(blog.get_text());
  System.out.println();
  
  Date d = new Date(); //Date.java class object
  d.set_date("June", 26, 2019);
  System.out.println(d);


 }
}
