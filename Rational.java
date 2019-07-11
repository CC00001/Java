class Rational{

 private int numerator, denominator;
 private static int wholeNumber;

 public Rational(int n, int d){
   int g = greatestCommonDenominator(n, d);//Simplify fraction by using common Denominator
   if(d == 0) System.out.println("Denominator cannot be 0.");
   else numerator = n / g; denominator = d / g;
 }

 public Rational(int w){
  if(w == 0) System.out.println("Denominator couldnot be 0");
  else {this.wholeNumber = w;} 
 }

 public Rational(){
  numerator = 0;
  denominator = 0;
  wholeNumber = 0;
 }
  
 private static int greatestCommonDenominator(int a, int b){
  if(a < 0) a = -a;
  if(b < 0) b = -b;
  if(b == 0) return a;
  return greatestCommonDenominator(b, a % b);
 }

 public static Rational addition(Rational a, Rational b){
  if(a.denominator == b.denominator) //If fractions had common Denominator
  return new Rational(a.numerator + b.numerator, a.denominator); 
  else //If not common denominator
  return new Rational((a.numerator * b.denominator + b.numerator * a.denominator), a.denominator * b.denominator);
 }
 
 public static Rational addition(Rational b){//Overloading method with only one parameter
  return new Rational(wholeNumber + b.wholeNumber);
 }

 public static int subtraction(int a, int b){
  return a - b;
 }

 public static int multiplication(int a, int b){
  return a * b;
 }

 public static int division(int a, int b){
  return a / b;
 }

 public static int normalize(int a, int b){
  if(a < 0) a = a;
  else a = -a;
  if(b < 0) b = -b;
  return normalize(a, b);
 }

 public static boolean isEquals(Rational a, Rational b){
  boolean e = false;
  if(a.equals(b)) e = true;
  return e;
 }

 public String toString(){
  return (this.numerator + "/" + this.denominator + ", the wholenumber is: " + wholeNumber);
 }

 
 public static void main(String [] args){
  Rational r1 = new Rational(3, 8);
  Rational r2 = new Rational(9, 5);
  Rational r3 = new Rational(8);
  Rational r4 = new Rational(3);
 
  System.out.println(r1.numerator + " " + r1.denominator + " " + r2.numerator + " " + r2.denominator);
  System.out.println("Greast common Denominator is:" + greatestCommonDenominator(r1.denominator, r2.denominator));
  
  System.out.println(r1);
  System.out.println(r2);
  System.out.println(addition(r1, r2));
  System.out.println(r3.addition(r4));
  //System.out.println(r1.addition(b));

 }
}
