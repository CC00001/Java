import java.util.Scanner;

class averageN{

 public static double calcAverage(int num, double [] N){
  double average = 0, sum = 0;
  for(int i = 0; i < num; i++){
   sum += N[i];
  }
   average = sum / num;
  return average;
 }

 /*public static double [] getNumber(int num, double [] N) throws Exception{
  Scanner input = new Scanner(System.in);
   for(int i = 0; i< num; i++){
    System.out.println("Please enter N number:");
    N[i] = input.nextDouble();  
    if(N[i] < 0) throw new Exception("N must be greater than 0.");
   }
   return N;
  }*/

 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int num = 0;

  System.out.println("Please enter how many numbers you want:");
  num = input.nextInt();
  double [] N = new double[num];
  
   for(int i = 0; i < num; i++){
    try{
     System.out.println("Please enter N number:");
     N[i] = input.nextDouble();
     if(N[i] < 0) throw new Exception("N must be greater than 0.");
   
    }catch(Exception e){
     System.out.println(e.getMessage());
     input.next(); //claer the scanner and make a new input.
    }
   }
   System.out.println("Average is: " + calcAverage(num, N));

 }
}
