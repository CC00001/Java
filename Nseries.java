import java.util.Scanner;

class Nseries{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  int N;
  int sum =0;

  System.out.println("Enter a number for N Series Sum:");
  N = input.nextInt();
  N *= 2;
  do{
  System.out.print(Math.pow(N, 2) + "\t");
  sum += Math.pow(N, 2);
  N -= 2;
  }while(N != 0);

 System.out.println("The Sum of terms:" + sum);
 }
}

