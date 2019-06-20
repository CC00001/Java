import java.util.Scanner;

class armstrong{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  String numString;
  int numInt, numSum = 0;

  System.out.println("Enter a number:");
  numString = input.nextLine();
  numInt = Integer.parseInt(numString);
  
  //System.out.println(digits);

   for(int i = 0; i < numString.length(); i++){
    int digit = Integer.parseInt(numString.substring(i, i+1));
    numSum += Math.pow(digit, 3);
   }

   if(numInt == numSum) System.out.println(numString + " is a Armstrong number.");
   else System.out.println(numString + " is NOT a Armstrong number.");
 } 
}
