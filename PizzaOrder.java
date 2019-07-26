/*-Author: WEI CHAO WU
 * PizzaOrder class using Pizza classs to create it's object tom implement member functions
 *
*/
class PizzaOrder{

 protected Pizza p1, p2, p3;//Create the Pizza class variables with static type so that they can be accessed all over the class
 protected static int num_Pizzas;
 protected double price;
 private PizzaOrder po1, po2, po3;
 
 public PizzaOrder(){ //Default constructor set PizzaOrder object to null if it was not set
  num_Pizzas = 0;
  p1 = null;
  p2 = null;
  p3 = null;
 }

 public PizzaOrder(int n, Pizza pizza1, Pizza pizza2, Pizza pizza3){ //Constructor
  num_Pizzas = n;
  p1 = pizza1;
  p2 = pizza2;
  p3 = pizza3;
 } 

 public PizzaOrder(PizzaOrder o){ //Copy Constructor
  if(o == null){
   System.out.println("Fatal Error!");
   System.exit(0);
  }
  num_Pizzas = o.num_Pizzas;
  //if(p1 == null || p2 == null || p3 == null) return;
  //else
  p1 = new Pizza(o.p1);
  p2 = new Pizza(o.p2);
  p3 = new Pizza(o.p3);
 } 

  public void setNumPizzas(int numPizzas){
   if(numPizzas <= 3 && numPizzas > 0) num_Pizzas = numPizzas;
   else System.out.println("Please enter the number of piazzas between 1 and 3.");
  }

  public void setPizza1(Pizza pizza1){
   p1 = pizza1;
  }

 public void setPizza2(Pizza pizza2){
  p2 = pizza2;
 }

 public void setPizza3(Pizza pizza3){
  p3 = pizza3;
 }

 public Pizza getPizza1(){
  return p1;
 }
 
 public Pizza getPizza2(){
  return p2;
 }

 public Pizza getPizza3(){
  return p3;
 }

 //calcTotal() to calculate the price base on how many pizzas in an order
 public double calcTotal(){
  double total = 0;
  if(num_Pizzas == 1)
  total = p1.calcCost(p1.get_Size(), p1.get_Topping());
  else if(num_Pizzas == 2)
  total = p1.calcCost(p1.get_Size(), p1.get_Topping()) + p2.calcCost(p2.get_Size(), p2.get_Topping());
  else if(num_Pizzas == 3)
  total = p1.calcCost(p1.get_Size(), p1.get_Topping()) + p2.calcCost(p2.get_Size(), p2.get_Topping()) + p3.calcCost(p2.get_Size(), p3.get_Topping());

  return total;
 }
 
 public String toString(){
  return ("Pizza 1: " + p1 + "\n" + "Pizza2: " + p2 + "\n" + "Pizza 3: " + p3);
 }

 public static void main(String [] args){
  Pizza pizza1 = new Pizza('l', 1, 0, 1);//Create the instance for Pizza type 
  //p1 = pizza1;
  Pizza pizza2 = new Pizza('m', 2, 2, 0);
  //p2 = pizza2; //Assigned the static variable to Pizza type object
  pizza1.getDescription();
  Pizza pizza3 = new Pizza();
  System.out.println();
  pizza2.getDescription();
  PizzaOrder order = new PizzaOrder();
  order.setNumPizzas(2);
  order.setPizza1(pizza1);
  order.setPizza2(pizza2);
  //System.out.println(pizza1);
  System.out.println();

  double total = order.calcTotal();
  System.out.println();
  System.out.println("The order with " + num_Pizzas + " pizza(s) is $" + total); //num_Puzzas is the staitc variable so it get called without invoke any object
 }

}
