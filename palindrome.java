import java.util.Scanner;

class palindrome{

 public static void main(String [] args){

 Scanner input = new Scanner(System.in);
 int num, temp, reserveNum = 0, reminder = 0;

 System.out.println("Enter a number:");
 num = input.nextInt();
 temp = num; // Let temporary variable assigned to num so that num won't be changed 

 while(temp != 0){ //Substite temp variable to caluate the reserve number.
  reminder = temp % 10; //Get remider by % 10
  reserveNum = reserveNum * 10 + reminder; //reserve a number, and reserve * 10 + reminder to get a new number.
  temp /= 10; // Number divied by 10 to get a new number
 } 
  
   if(num == reserveNum) System.out.println(num + " is a palindrome number.");
   else System.out.println(num + " is NOT a palindrome number.");
   //System.out.println(num);
   } 
  }  

