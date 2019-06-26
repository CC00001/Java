import java.util.Scanner;

public class Demo_Rectangle2{

 private int length, breath;

 public void set_length(int l){
  length = l;
 }
 
 public void set_breath(int b){
  breath = b;
 }

 public int get_breath(){
  return breath; 
 }

 public int get_length(){
  return length;
 }

 public int area(){
  int area = breath * length;
  return area;
 }
 
 public int primeter(){
  int primeter = 2 * length * breath;
  return primeter;
 }

 
}
