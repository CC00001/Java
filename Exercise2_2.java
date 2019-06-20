import java.util.Scanner;

class Exercise2_2{

 public static void main(String [] args){

 Scanner input = new Scanner(System.in);

 String numString;
 int choice, N;

 do{
  System.out.println("Please Enter following number under the promot:");
  System.out.println("1: N series terms.");
  System.out.println("2: A ArStrong number.");
  System.out.println("3: A Prime Number.");
  System.out.println("4: Multiples Output.");
  System.out.println("5: Sum of Even OR Odd Number."); 
  System.out.println("6: Palindrome.");
  System.out.println("7: N Factorial(n!).");
  System.out.println("0: Exit.");
  System.out.println();
  choice = input.nextInt();
  System.out.println();
 
  switch(choice){ 
   case 1:
     System.out.print("Enter a number for N Series Sum:");
     N = input.nextInt();
     Nseries(N);
     System.out.println();
     break;
    case 2:
     System.out.print("Enter a number:");
     numString = input.next();
     System.out.println();
     armStrong(numString);
     System.out.println();
     break;
    case 3:
     System.out.print("Enter a number:");
     numString = input.next();
     System.out.println();
     primeNumber(numString);
     System.out.println();
    case 4:
     System.out.print("Enter a number:");
     N = input.nextInt();
     System.out.println();
     ten_multiples(N);
     System.out.println();
     break;
    case 5:
     System.out.print("Enter a number:");
     numString = input.next();
     System.out.println();
     oddEvenSum(numString);
     System.out.println();
     break;
    case 6:
     System.out.print("Enter a nubmer:");
     N = input.nextInt();
     if(palindrome(N)) System.out.println(N + " is a palindrome number.");
     else System.out.println(N + " is NOT a palindrome number.");
     System.out.println();
     break;
     default:
     System.out.println("Bye!!!.");
   }
  }while(choice != 0);
  
 }
 
  //Implementing menthods outside the "main{}", but inside the "class{} with public static"

   public static int Nseries(int n){ // Find out the terms like "2^2 + 4^2 + 6^2...." up to N terms, the base is increased by 2 each time, and the power is 2.
    int sum = 0;
    n *= 2;
    do{
      System.out.print((n * n) + "\t");
      sum += Math.pow(n, 2); //Math.pow() return double value
      n -= 2;
      } while(n != 0);
      System.out.println("The Sum of terms:" + sum);
    return sum;
   } 
  
   public static void armStrong(String num){ // A armstrong number is a one number which sum of the cubes of the digits is equal to the number itself
    int numInt, numSum = 0;
    numInt = Integer.parseInt(num);
    
    for(int i = 0; i < num.length(); i++){
     int digit = Integer.parseInt(num.substring(i, i+1));
     numSum += Math.pow(digit, 3);
    }
    
    if(numInt == numSum) System.out.println(num + " is a Armstrong number.");
    else System.out.println(num + " is NOT a Armstrong number.");
   }
   
  public static void primeNumber(String num){ // If number is divisble by 1 and itself is a prime number
    int number = Integer.parseInt(num);
    if(number % 1 == 0 && number % 2 != 0) System.out.println("It is a prime number.");
    else System.out.println("It is a composite number.");
  }
  
  public static int ten_multiples(int num){ // Using the for loop to print out the multiplation table 
   int result = 0;
   for(int i = 1; i <= 10; i++){
    result = i * num;
    System.out.println(num + " x " + i + " = " + result);
   }
   return result; 
  }

 public static void oddEvenSum(String num){ //using %2 to determine each digit of the number if even or odd, then add add them up for even and odd, counting the # of even and odd.
  int digit, even, odd, evenCount, oddCount;
  digit = even = odd = evenCount = oddCount = 0;
  for(int i = 0; i <= num.length() - 1; i++){
   digit = Integer.parseInt(num.substring(i, i+1));
   if(digit % 2 == 0){
    even += digit;
    evenCount++;
   }
   else{
    odd += digit;
    oddCount++;
   }
  }
   System.out.println("Sum of even digits = " + even);
   System.out.println("Sum of odd digits = " + odd);
   System.out.println("Number of even digits = " + evenCount);
   System.out.println("Number of odd digits = " + oddCount);
 }

 public static boolean palindrome(int num){ //Bool method to return true or false
  int temp = num, reserveNum = 0, reminder = 0;
  boolean pal;
  while(temp != 0){
   reminder = temp % 10;
   reserveNum = reserveNum * 10 + reminder;
   temp /= 10;
  }
  if(num == reserveNum) pal = true;
  else pal = false;
  return pal;
 }

}
