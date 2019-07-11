/*Exercise5.1
 * Author WEI CHAO WU
 * Making airplane seats and full fill the seats with 2D array!
 *
 */

import java.util.Scanner;

class Exercise5_1{
 
  public static char [][] initSeats(char a [][]){

   for(int i = 0; i < a.length; i++){//Array only can accept 1 data type as a 2D array, but you can increase i by + 1 to generate numbers
   a[i][0] = 'A';
   a[i][1] = 'B';
   a[i][2] = 'C';
   a[i][3] = 'D';
   }
   return a;
  }

  public static void Display(char a [][]){ //Display method
    for(int i = 0; i < a.length; i++){
     System.out.println(i + 1 + " " + a[i][0] + " " + a[i][1] + " " + a[i][2] + " " + a[i][3]);  
   }
}
 
 
  public static char [][] pickSeat(char [][] a, int r, char c){ //Pickup seat method
    for(int i = 0; i < a.length; i++){
      if((i+1) == r && a[i][0] == c) a[i][0] = 'X';
      else if((i+1) == r && a[i][1] == c) a[i][1] = 'X';
      else if((i+1) == r && a[i][2] == c) a[i][2] = 'X';
      else if((i+1) == r && a[i][3] == c) a[i][3] = 'X';
    }
    return a;
 }
 
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  char [][] seats = new char [7][4];//Generate 2D array with size
  int row = 0;
  char col = ' ';

  initSeats(seats);//Initialize seats
  Display(seats);//Display orginal seats
  System.out.println();
  
  for(int i = 0; i < seats.length; i++){//Generating 2D array loop
   for(int j = 0; j < seats[i].length; j++){
    while(seats[i][j] != 'X'){//Made condition to select seats until all seats full
     System.out.println("Please select row#(1-7):");
     row = input.nextInt();
     System.out.println("Please select col(A-D):");
     col = input.next().charAt(0);
     col = Character.toUpperCase(col);//make char upper case
     pickSeat(seats, row, col);
     Display(seats);
     }
    }
   }
     System.out.println("Sorry, all seats fulled, thank you for your interesting!~");
 
  
 }
}
