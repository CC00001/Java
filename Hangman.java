import java.util.Scanner;
import java.lang.Object;
import java.util.Random;

class Hangman{ // Function for generating random string

 public static String random_list(String s){
  String str1 = "This is random test.";
  String str2 = "This is an apple.";
  String str3 = "How is the nice weather.";
  String str4 = "Let me guesssing.";
  String str5 = "Connection successed.";
  String str6 = "Hills server.";
  String str7 = "What ever it is.";
  String str8 = "Good Morning.";
  String str9 = "How many miles of your car?";
  String str10 = "Good bye.";
  
  String [] list = {str1, str2, str3, str4, str5, str6, str7, str8, str9, str10};
  
  Random select = new Random();
  s = list[select.nextInt(list.length)];
  return s;
 }

 public static String Hidden(String str){
  String h_str = "";
  char [] c_str = {};
  StringBuilder obj1 = new StringBuilder(str);
  for(int i = 0; i < c_str.length; i++){
   c_str[i] = obj1.charAt(i);
   obj1.replace(0, obj1.length() -1, "*");
   System.out.print(obj1);
  }
   //obj1.replace(c_str[i], c_str[i-1], "*");
   //obj1.append();
   return str;
   }


 public static void main(String [] args){

  String str = "";
  String n_str = random_list(str);
  //StringBuilder obj1 = new StringBuilder(n_str);
  //obj1.append("This is a shit");
  //System.out.println(obj1);
  /*
  for(int i = 0; i <= n_str.length; i++){
  n_str = obj1.replace(i, i - 1, '*'); 
  }
  for(int i = 0; i < n_str.length(); i++)  {
  obj1.replace(i, n_str[i-1], "*");
  }*/
  System.out.println(Hidden(n_str));

 }
}
