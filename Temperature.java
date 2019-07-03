import java.util.Scanner;

class Temperature{

 private float temp;
 private char scale;

 public Temperature(float t){//First constructor with pass in temperature with default Celsius
  this.temp = t; 
  this.scale = 'C';
 }

 public Temperature(char s){//Second constructor with pass in scale with default 0 degree
  this.scale = s;
  this.temp = 0;
 }

 public Temperature(float t, char s){//Third constructor with pass in 2 parameters
  this.temp = t;
  this.scale = s;
 }

 public Temperature(){//Fourth constructor with no pass in parameters
  this.temp = 0;
  this.scale = 'C';
 }


 public static float calacCelsius(float DegreesF){
  float DegreesC = 5 * (DegreesF - 32) / 9;
  return DegreesC;
 }

 public static float calacFahrenheit(float DegreesC){
 float DegreesF = (9 * DegreesC / 5 + 32);
 return DegreesF;
 }
 
 public static boolean temperatureEqual(String t1, String t2){
  boolean equal = false;
  if(t1.equals(t2)) equal = true;
  return equal;
 }

 public static boolean temperatureGreater(String temp1, String temp2){
  boolean greater = false;
  char s1 = temp1.charAt(temp1.length()-1);
  char s2 = temp2.charAt(temp2.length()-1);
  float t1 = 0, t2 = 0;
  t1 = Float.parseFloat(temp1.substring(0, temp1.length()-1));
  t2 = Float.parseFloat(temp2.substring(0, temp2.length()-1));
  
   if(s1 == s2) 
    if(t1 > t2)
     greater = true;
 return greater;
 }

 public static boolean temperatureLess(String temp1, String temp2){
  boolean less = false;
  char s1 = temp1.charAt(temp1.length()-1);
  char s2 = temp2.charAt(temp2.length()-1);
  float t1 = 0, t2 = 0;
  t1 = Float.parseFloat(temp1.substring(0, temp1.length()-1));
  t2 = Float.parseFloat(temp2.substring(0, temp2.length()-1));

   if(s1 == s2)
    if(t1 < t2)
     less = true;
 return less;
 }

 public String toString(){
  return ("The Temperature is " + this.temp + " " + this.scale);
 }

 public static void main(String [] args){
  Temperature t1 = new Temperature(32);
  Temperature t2 = new Temperature('F');
  Temperature t3 = new Temperature();
  Temperature t4 = new Temperature(0, 'F');

  t1.temp = t1.calacCelsius(t2.temp);

  String temp1 = t1.temp + " " + t1.scale;
  String temp2 = t2.temp + " " + t2.scale;
  
  //System.out.print("Please Enter first temperature with scale:");
  
  if(temperatureGreater(temp1, temp2)) System.out.println(temp1 + " is greater than " + temp2);
  else System.out.println(temp1 + " is NOT greater than " + temp2);
  
  System.out.println(t1);
  System.out.println(t2);
 }
}
