class Rational{

 private int numerator, denominator, wholeNumber;
 
 public Rational(int n, int d){
   int g = greatestCommonDenominator(n, d);//Simplify fraction by using common Denominator
   if(d == 0) 
   System.out.println("Denominator cannot be zero.");
   numerator = n / g; denominator = d / g;
 
   /*if(d < 0){
    numerator = -numerator; 
    denominator = -denominator;
    }*/
 }

 public Rational(int w){
  //if(w == 0) System.out.println("Denominator couldnot be 0");
  wholeNumber = w; wholeNumber /= 1;
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
 
 public Rational addition(Rational b){//Overloading method with only one parameter, using "this" to indicate the object 'a' itself
  if(this.denominator == b.denominator)
  return new Rational(this.numerator + b.numerator, this.denominator);
  else
  return new Rational(this.numerator * b.denominator + b.numerator * this.denominator, this.denominator * b.denominator);
 }

 public static Rational subtraction(Rational a, Rational b){
  if(a.denominator == b.denominator)
  return new Rational(a.numerator - b.numerator, a.denominator);

  return new Rational((a.numerator * b.denominator - b.numerator * a.denominator), a.denominator * b.denominator);
 }

 public Rational subtraction(Rational b){
  if(this.denominator == b.denominator)
  return new Rational(this.numerator + b.numerator, this.denominator);
  
  return new Rational(this.numerator * b.denominator - b.numerator * this.denominator, this.denominator * b.denominator);
 }

 public static Rational multiplication(Rational a, Rational b){
  return new Rational(a.numerator * b.numerator, a.denominator * b.denominator);
 }

 public Rational multiplication(Rational b){
  return new Rational(this.numerator * b.numerator, this.denominator * b.denominator);
 }

 public static Rational division(Rational a, Rational b){
  return new Rational(a.numerator / b.numerator, a.denominator / b. denominator);
 }

 public Rational division(Rational b){
  return new Rational(this.numerator / b.numerator, this.denominator * b.denominator);
 }

 public static Rational normalize(Rational a){
  if(a.denominator < 0){
  a.numerator *= -1; a.denominator *= -1;
  }
  return a;
 }

 public static boolean isEquals(Rational a, Rational b){
  boolean e = false;
  if(a.equals(b)) e = true;
  return e;
 }

 public String toString(){
  if(denominator == 1)
  return (numerator + " ");
  else{
  //normalize(this.numerator, this.denominator);
  return (this.numerator + "/" + this.denominator);
  }
 }

 
 public static void main(String [] args){
  Rational r1 = new Rational(1, 6);
  Rational r2 = new Rational(-4, -8);
  Rational r3 = new Rational(10, 5);
  Rational r4 = new Rational(4, 2);
  
  System.out.println("Rational number 1: " + r1.toString() + ", Rational number 2: " + r2.toString());
  System.out.println("Greast common Denominator is:" + greatestCommonDenominator(r1.denominator, r2.denominator));
  
  System.out.println("WholeNumber:" + r3);
  System.out.println(r2);
  System.out.println("addition(x, y) version:" + normalize(addition(r1, r2)));
  System.out.println("x.addition(y) version:" + normalize(r1.addition(r2)));
  System.out.println("Subtraction(x, y) version:" + normalize(subtraction(r1, r2)));
  System.out.println("x.subtraction(y):" + normalize(r1.subtraction(r2)));
  System.out.println("multiplicaton(x, y) version:" + normalize(multiplication(r3, r4)));
  System.out.println("x.multiplication(y) version:" + normalize(r3.multiplication(r4)));
  System.out.println("division(r3, r4) version:" + normalize(division(r3, r4)));
  System.out.println("x.division(y) version:" + normalize(r3.division(r4)));


 }
}

