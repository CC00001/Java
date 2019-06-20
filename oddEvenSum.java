import java.util.Scanner;

class oddEvenSum{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  String numString;
  int digit, even, odd, evenCount, oddCount;
  digit = even = odd = evenCount = oddCount = 0;
  System.out.println("Enter a number:");
  numString = input.next();
   
 for(int i = 0; i <= numString.length(); i++){
  digit = Integer.parseInt(numString.substring(i, i+1));
  if(digit % 2 == 0) {
   even += digit;
   evenCount++;
  }
  else{ 
   odd += digit;
   oddCount++;
  }
 }

 System.out.println("Sum of even digits = " + even);
 System.out.println("Sum of odd digits  = " + odd);
 System.out.println("Number of even digits = " + evenCount);
 System.out.println("Number of odd digits = " + oddCount);

 }
}
