import java.util.Scanner;

class ten_multiples{

 public static void main(String [] args){
 
 Scanner input = new Scanner(System.in);

 int num, result;
 System.out.println("Enter a number:");
 num = input.nextInt();

 for(int i = 1; i <= 10; i++){
  result = i * num;
  System.out.println(num + " x " + i + " = " + result);
  }

 }
}
