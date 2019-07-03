import java.util.Scanner;

public class Demo_Rectangle1{

 public static void main(String [] args){
 
 Scanner input = new Scanner(System.in);

 int x, y;
 Demo_Rectangle2 r = new Demo_Rectangle2();
 System.out.println("Enter length and breath:"); 
 x = input.nextInt();
 y = input.nextInt();
 r.set_length(x);
 r.set_breath(y);
 System.out.println("With length = " + r.get_length() + " breath  " + r.get_breath());
 System.out.println("Area is " + r.area() + " primer is " + r.primeter());

 }
}
