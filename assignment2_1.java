import java.util.Scanner;

class assignment2_1{

 public static int threeLargest(int a, int b, int c){
   if(a > b && a > c) return a;
   else if( b > a && b > c) return b;
   else if( c > a && c > b) return c;
 return threeLargest(a, b, c);
 }

 public static double averageGrade(double a, double b, double c, double d, double e){
  double grade = 0;
  grade = (a + b + c + d + e)/5;
  System.out.printf("Student average grade is %.2f.%n", grade);
  if(grade >= 90) System.out.println("E");
  else if(grade >= 80 && grade <= 89) System.out.println("A");
  else if(grade >= 70 && grade <= 79) System.out.println("B");
  else if(grade >= 60 && grade <= 69) System.out.println("C");
  else if(grade >= 50 && grade <= 59) System.out.println("D");
  else if(grade <= 50) System.out.println("F"); 
 return grade;
 }

 public static void main(String [] args){
  
  Scanner input = new Scanner(System.in);

  int x, y, z;
  double a, b, c, d, e;
  
  System.out.println("Enter the first #:");
  x = input.nextInt();
  System.out.println("Enter the second #:");
  y = input.nextInt();
  System.out.println("Enter the third #:");
  z = input.nextInt();
  System.out.println("The largest 3 number is " + threeLargest(x, y, z));
  System.out.println();

  System.out.println("Enter the first class's grade:");
  a = input.nextDouble();
  System.out.println("Enter the second class's grade:");
  b = input.nextDouble();
  System.out.println("Enter the third class's grade:");
  c = input.nextDouble();
  System.out.println("Enter the fourth class's grade:");
  d = input.nextDouble();
  System.out.println("Enter the fifth class's grade:");
  e = input.nextDouble();
  averageGrade(a, b, c, d, e);
 }
}
