class newPizzaOrder extends PizzaOrder{
 
 private newPizzaOrder npo1, npo2, npo3;

  newPizzaOrder(int num, Pizza p1, Pizza p2, Pizza p3){
  super(num, p1, p2, p3);
  }

  newPizzaOrder(newPizzaOrder o){
   if(o == null){
    System.out.println("Fatal Error.");
    System.exit(0);
   }
   npo1 = o.npo1;
   npo2 = o.npo2;
   npo3 = o.npo3;
  }

 public int getNumPizzas(){
  return num_Pizzas;
 }

 public Pizza getPizza1(){
  return p1;
 }

 public Pizza getPizza2(){
  return p2;
 }

 public Pizza getPizza3(){
  return p2;
 }

 public static void main(String [] args){
  Pizza pizza1 = new Pizza('l', 1, 0, 1);
  Pizza pizza2 = new Pizza('m', 2, 2, 0);
  Pizza pizza3 = new Pizza();
  PizzaOrder order1 = new PizzaOrder(2, pizza1, pizza2, pizza3);
  order1.setNumPizzas(2);
  order1.setPizza1(pizza1);
  order1.setPizza2(pizza2);
  double total = order1.calcTotal(); //18 + 20 = 38  

 
  PizzaOrder order2 = new PizzaOrder(order1);//Use copy constructor
  
  //if(order2 instanceof newPizzaOrder) //Down casting
  //((newPizzaOrder)order2).getPizza1().set_Cheese(3);
 //else System.out.println("order2 is not the instance of newPizzaOrder");
  
  order2.getPizza1().set_Cheese(3);
  System.out.println("Order 1: " + order1);
  System.out.println("Order 2: " + order2);
  total = order2.calcTotal();

  double origTotal = order1.calcTotal();

  System.out.println("Order 2 total: " + total);
  System.out.println("Order 1 orginal total: " + origTotal);
 }
}
