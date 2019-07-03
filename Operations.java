class Operations{

 private int num, result, power;

 public Operations() {}

 public Operations(int n, int r, int p){
  num = n;
  result = r;
  power = p;
 }

 //Setters
 public void set_num(int n){
  n = num;
 }

 public void set_result(int r){
  r = result; 
 }

 public void set_power(int p){
  p = power;
 }

 //Getters
 public int get_num(){
  return num;
 }
 
 public int get_result(){
  return result;
 }

 public int get_power(){
  return power;
 }
 
 //Member functions
 public int COMPOSITE(int num){
  //String number = String.valueOf(num);
  if(num % 1 == 0 && num % 2 != 0) System.out.println(0);
  else System.out.println(1);
  return num;
  }
  
 public int COUNT(int num){
  for(; result <= String.valueOf(num).length() - 1; ){
   result++;
  }
  System.out.println(num + " is " + result + " digits.");
  return result;
 }

 public int POWER(int num, int power){
  result = (int) Math.pow(num, power);
  System.out.println(result);
  return result;
 }
}
