import java.util.Scanner;

class Demo{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  int choice, number, exponet;
  int one, two, three;
  one = two = three = 0;
  Operations obj1 = new Operations(); //Default constructor


  do{
    System.out.println("1. Compposite number");  
    System.out.println("2. Counting the number.");
    System.out.println("3. Find the number in power");
    System.out.println("4. A constructor function");
    System.out.println("Enter 0 to exit.");
    choice = input.nextInt();
    switch(choice){
     case 1:
            System.out.println("Enter a number:");
            number = input.nextInt();
            obj1.COMPOSITE(number);
            System.out.println();
            break;
     case 2:
           System.out.println("Enter a number:");
           number = input.nextInt();
           obj1.COUNT(number);
           System.out.println();
           break;
    case 3:
           System.out.println("Enter the base number:");
           number = input.nextInt();
           System.out.println("Enter the exponet:");
           exponet = input.nextInt();
           System.out.println();
           obj1.POWER(number, exponet);
           System.out.println();
           break;
    case 4:
           System.out.println("Default constructor: " + obj1.get_num() + obj1.get_result() + obj1.get_power());
           System.out.println("Enter the first nubmer:");
           one = input.nextInt();
           System.out.println("Enter second number:");
           two = input.nextInt();
           System.out.println("Enter the third nubmer:");
           three = input.nextInt();
  
           Operations obj2 = new Operations(one, two, three); //Constructor with pass in variables
           System.out.println("Constructor with pass in parameter: " + obj2.get_num() + obj2.get_result() + obj2.get_power());
           System.out.println();
    }

  }while(choice != 0);
  /*obj1.COMPOSITE(6);
  obj1.COUNT(123);
  obj1.POWER(2, 3);  */
 }
}
