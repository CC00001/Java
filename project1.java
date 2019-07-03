/*
1.    What is the effect of the absence of break in a switch…case construct?            
  
      -----> The program will excute the rest of the program

2.    What is the difference between while and do…while? Explain with the help of an example.                               
      ------> while loop will evaluate the condition before excute the block of codes, but do....while loop will excaute the code at onece. e.g. while(condition){ codes will be excute after evaluate the condition}  do{excute codes at least onece, then evaluate the condtion}while(condition)
 

3.    Differentiate between syntax errors and runtime errors.                                      
     ----> A prgram with a syntax error cannot be executed. The program with a runtime run time error can be executed but dums under certain conditions, and syntax errors are static error that can be detected by the compiler, runtime errors are dynamic error that cannot be detected by the compiler. 
 

4.    Differentiate between unary, binary and ternary operators. Give examples.       
      ----->Unary operators are those that work on sigle operand, e.g. '++','--', int a = b++; Binary operators are the one that operate on two operands e.g. '+', c=a+b; Ternary operators are the one that operates on three operands. e.g. c = a>b?e:f(if a is greater than b, then return 'e' otherwise return 'f')
 

5.    Convert the following as directed:
   
 

a. // switch to if else                                                                                     

switch (ch)

{

  case 1: System.out.println(”Yes”);

          break;

  case 2: System.out.println(”No”);

               break;

  default: System.out.println(”Wrong choice”);

}


--->if(ch){
     System.out.println("Yes");
    }
    else if(!ch){
     System.out.println("No");
    }
    else{
     System.out.println("Wrong choice");
    }
 

b. // do…while to while                                                                             

char ans;

int num;

do

{

  System.out.println(”Enter a number”);

  num=input.nextInt();

  System.out.println(”The square of the number is : “num*num<<endl;

  System.out.println(”Do you want to continue?”;

  ans=input.nextChar();

} while (ans == ‘Y’);

---->char ans;
     int num;
     
     System.out.println("Do you want to continue?");
     ans == input.nextChar();
     while(ans == 'Y'){
       System.out.println("Enter a number:");
       num = input.nextInt();
       System.out.println("The square of the number is:" + num*num);
     }

6.    What is the output if the following program segments :                                      

     int x=9, y=5;

     int c = (float) x/y;

     System.out.println(c);

     ---> error, lossy coversion from float to int

7.    Evaluate the following conditional expression as true or false for the give values of a, b, c and d:

(( a >= b) && (b < d)) && ((c < d + 4) || (a < c))    

 

a)     a = 6, b = 2, c = 5, d = 3 ----->True                                                                

b)    a = 3, b = 7, c = 4, d = 5 ----> False

 

8.    Find syntax errors, rewrite code by underlining the   corrections.                                         

 

void main()

  int num

  System.out.println(Enter a number);

  Num=input.nextDouble();

  if num >100

  System.out.println(Big number);

}

----> void main(){
       int num;
       System.out.println("Enter a number");
       num - input.nextInt();
       if num > 100;
       System.out.println("Big number");
      }

 

 

9.    Write Java programs to find and display the sum of the following series (up to N terms) :

a.     1 + 3 + 5 + 7 …                                                                                           

b.     22 + 42 + 62…                                                                                       

c.  To take the input of two numbers and then find and display their HCF (highest common factor)(Extra Credit 5 points)

 

10. Write a program to  display n terms of  a Fibonacci series. In Fibonacci series, (Extra credit 5 points)

first term = 0

second term =1

Every other term is the  sum of previous two terms.

0       1         1         2          3         5          #Fibonacci Series
 *
 *
 *
 *
 *
 *
 *
 * */

import java.util.Scanner;

class project1{

  public static int ninea(int N){
   int r = 0;
   while(N >= 0){
    r += N;
    N -= 2;
   }
   System.out.println(r);
   return N;
  }

  public static int nineb(int N){
   double r = 0;
   while(N != 0){
    r += Math.pow(N, 2);
    N -= 2;
   }
   System.out.println(r);
   return N;
  }

  public static int HCF(int a, int b){
   if(a == 0) return b;
   if(b == 0) return a;
   if(a == b) return a; //base case
   if(a > b) return HCF(a-b, b); //recursive function
   else if(a < b) return HCF(a, b-a);
   return HCF(a, b);
  }

  public static int Fibonacci(int N){
   int first = 0, second = 1, r = 0;
    System.out.print("0 1 ");
    while(r <= N){
    r = first + second;
    System.out.print(r + " ");
     int temp = second;
     first = temp;
     second = r;	
    }
   return N;
  }

  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   
   int a, b;
   
   System.out.print("9a: Enter the term:");
   a = input.nextInt();
   ninea(a);
   System.out.println();
      
   System.out.println("9b: Enter the term:");
   a = input.nextInt();
   nineb(a);
   System.out.println();
   
   System.out.println("9c: Enter the first number:");
   a = input.nextInt();
   System.out.println("Enter the second number:");
   b = input.nextInt();
   System.out.println(" The Highest Common Factor of " + a + " and " + b + " is " + HCF(a,b));
   System.out.println();
   
   System.out.println("10: Enter the term:");
   a = input.nextInt();
   Fibonacci(a);
   System.out.println();

 }
}
