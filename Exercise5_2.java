/*Person.java
 *Vehicle.java
 *
 *
 */

class Exercise5_2{

 public static void main(String [] args){
  Person p1 = new Person();
  Vehicle v1 = new Vehicle();
  Truck t1 = new Truck(p1, v1, 50, 100);

  System.out.println(t1); 
 
 }
}
