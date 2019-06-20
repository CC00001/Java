import java.util.Scanner;

class primeNumber{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  String numString;
  //char numChar;
  int num = 0;

  do{
   System.out.println("Enter a nubmer(q to quit):");
   numString = input.next();
   //numChar = numString.charAt(0);
   num = Integer.parseInt(numString);
   if(num % 1 == 0 && num % 2 != 0)
   System.out.println("It is a prime number.");
   else System.out.println("It is a composite number.");
   //System.out.println("Do you want to continue:(y/n):");
   //numChar = input.next().charAt(0);
   }while(numString != "q");


 } 
}
