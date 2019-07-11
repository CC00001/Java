/*
 -Author: WEI CHAO WU
  In-clas Exericse 3.2
  Pizza class to calculate the price for a pizza
*/
import java.util.Scanner;

class Pizza{

 private char size;
 private int cheese_Num, pepperoni_Num, ham_Num, topping_Num;

 public Pizza() {} //Default constructor

 public Pizza(char s, int c, int p, int h){ //Constructor with parameters 
  size = s;
  cheese_Num = c;
  pepperoni_Num = p;
  ham_Num = h;
 } 

 //Set Methods
 public void set_Size(char s){
  size = s;
 }

 public void set_Cheese(int c){
  cheese_Num = c; 
 }
 
 public void set_Peppernoi(int p){
  pepperoni_Num = p;
 }

 public void set_Ham(int h){
  ham_Num = h;
 }

 //Getters
 public char get_Size(){
  return size;
 }
 
 public int get_Cheese(){
  return cheese_Num;
 }

 public int get_Peppernoi(){
  return pepperoni_Num;
 }

 public int get_Ham(){
  return ham_Num;
 }
 
 public int get_Topping(){
  return topping_Num = get_Cheese() + get_Peppernoi() + get_Ham();
 }

 public static double calcCost(char size, double topping_Num){ // Static method so that it could be called wothout using object
   double price = 0;
   if(size == 's') price = 10 + 2 * topping_Num;
   else if(size == 'm') price = 12 + 2 * topping_Num;
   else if(size == 'l') price = 14 + 2 * topping_Num;
   else System.out.println("Invalid input.");
   return price;
 }

 public void getDescription(){
  /*System.out.print("Size of Pizza:" + get_Size());
  System.out.println();
  System.out.print("The quantity of Cheese Topping " + get_Cheese());
  System.out.println();
  System.out.print("The quantity of Peppernoi Topping " + get_Peppernoi());
  System.out.println();
  System.out.print("The quantity of Ham Topping " + get_Ham());
  System.out.println();
  System.out.println("The Total of the pizze is " + calcCost(get_Size(), get_Topping()));
  */
  System.out.println(toString());
 }

 public String toString(){
  return ("Size of Pizza + " + get_Size() + ", the Topping quantity of the chesse is:" + get_Cheese() + ", Peppernoi is: " + get_Peppernoi() + ", Ham is:" + get_Ham() + ", number of Toppings:" + get_Topping() + ", The total of the pizza is:" + calcCost(get_Size(), get_Topping())); //Calling the static method calcCost()
 }
 

 public static void main(String [] args){
 
 Pizza p = new Pizza('l', 1, 1, 2); 
 
 p.getDescription();
 }

}



