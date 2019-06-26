import java.util.Scanner;

class assignment3_1{

 public static double fareCalculate(double Miles, int Class){
 double fares = 0;
  switch(Class){
    case 1:if(Miles <= 100) fares = 3 * Miles;
           else if(Miles > 100 && Miles <= 150) fares = 2.50 * Miles;
           else if(Miles > 150) fares = 2 * Miles;
           break;
    case 2:if(Miles <= 100) fares = 2 * Miles;
           else if(Miles > 100 && Miles <= 150) fares = 1.50 * Miles;
           else if(Miles > 150) fares = 1 * Miles;
           break;
    case 3:if(Miles <= 100) fares = 1.50 * Miles;
           else if(Miles > 100 && Miles <= 150) fares = 1 * Miles;
           else if(Miles > 150) fares = .50 * Miles;
           break;
   }
  return fares;
 }

 public static void main(String [] args){
  
  Scanner input = new Scanner(System.in);

  double Miles;
  int Class;
 
  System.out.println("Enter how many miles will you travel:");
  Miles = input.nextDouble();
  System.out.println("Enter what class do you want(1. Firsit Class/2. Second Class/3. Third Class):");
  Class = input.nextInt();
  
  double fares = fareCalculate(Miles, Class);

  if(Class == 1)
  System.out.printf("The First class's fare is %.2f.%n", fares);
  else if(Class == 2) 
  System.out.printf("The Second class's fare is %.2f.%n", fares);
  else if(Class == 3)
  System.out.printf("The Third class's fare is %.2f.%n", fares);


 }
}
