import java.util.Scanner;
import java.lang.Object;
import java.util.Random;

class Hangman{ // Function for generating random string
 private static String str;
 private static StringBuilder h_str;
 private static char s;

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

 public static StringBuilder Hidden(String str){
  StringBuilder obj1 = new StringBuilder(str);
  for(int i = 0; i < obj1.length(); i++){
   if(obj1.charAt(i) != '*' && obj1.charAt(i) != ' ')
   obj1.replace(i, i+1, "*");
  }
   //System.out.println(obj1);
   return obj1;
   }
 
 public static StringBuilder unHidden(char guess, StringBuilder phrase, StringBuilder hidden_phrase){
  if(phrase.length() == hidden_phrase.length())
   for(int i = 0; i < phrase.length(); i++){
    if(guess == phrase.charAt(i))
     hidden_phrase.setCharAt(i, guess); 
  }
  return hidden_phrase;
 }

 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Weclome to Hangman Game!");
  System.out.println();
  System.out.println("Please guessing following sentence:");
  System.out.println();
  str = random_list(str);//Generate random sentence  
  StringBuilder n_str = new StringBuilder(str); //Convert str to StringBuilder object
  h_str = Hidden(str);//Hidden() return StringBuilder object
  System.out.println(h_str);// Hidden generated sentence
 
 for(int i = 0; i < n_str.length(); i++){
  for(int j = 0; j < h_str.length(); j++){
  if(n_str.charAt(i) != h_str.charAt(j)){
  System.out.println("Please enter your guessing:");
  char guess = input.next().charAt(0);
  
  h_str = unHidden(guess, n_str, h_str); 
 
  System.out.println(h_str);
   }
   else if(n_str.charAt(i) == h_str.charAt(j)) System.out.println("Well done! The phrase is: " + n_str);
  }
 }

 }
}
