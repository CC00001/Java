import java.util.Scanner;

class Exercise4_3{

 public static void largeAndSmall(int [] a){
  int largest = a[0]; 
  int smallest = a[0];
  for(int i = 1; i < a.length; i++){
   if(a[i] > largest) largest = a[i];
   else if(a[i] < smallest) smallest = a[i];
  }
  System.out.println("The largest number in the array is:" + largest + ", the smallest number in the array is:" + smallest);
 }

 public static void findPrimeNum(int [] a){
  System.out.print("The prime numbers in the array is:");
  for(int i = 0; i < a.length; i++){
   if(a[i] % 1 == 0 && a[i] % 2 != 0)
    System.out.print(a[i] + " ");
  }
 }

 public static void replaceNum(int [] a, int o1, int o2, int r1, int r2){
  System.out.println("The orginal array is: ");
  for(int i = 0; i < a.length; i++){
   System.out.print(a[i] + " ");
  }
  System.out.println();
  System.out.println("The Replaced array is:");
  for(int i = 0; i < a.length; i++){
   if(o1 == a[i])
   a[i] = r1;
   else if(o2 == a[i])
   a[i] = r2;
   System.out.print(a[i] + " ");
  }
 } 

 public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 int [] array1 = new int[10];
 int x, orginal1, orginal2, replace1, replace2;

 System.out.println("1. Please enter 10 numbers:"); 
 for(int i = 0; i < array1.length; i++){
 x = input.nextInt();
 array1[i] = x;
 }
 
    largeAndSmall(array1);
    System.out.println();
    findPrimeNum(array1);
    System.out.println();

 System.out.print("Enter the 1st orginal number:");
 orginal1 = input.nextInt();
 System.out.print("Enter the 1st replace number:");
 replace1 = input.nextInt();
 System.out.print("Enter the 2nd orginal number:");
 orginal2 = input.nextInt();
 System.out.print("Enter the 2nd orginal number:");
 replace2 = input.nextInt();
    
    replaceNum(array1, orginal1, orginal2, replace1, replace2);
 } 
}
