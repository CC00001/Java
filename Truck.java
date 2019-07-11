class Truck extends Vehicle{
 private Vehicle vehicle; Person person;
 private double loadCap;
 private int towingCap;

 Truck() {
 person = new Person();
 vehicle = new Vehicle();
 loadCap = 0; 
 towingCap = 0;
 }

 Truck(Person p, Vehicle v, double l, int t){
  person = p;
  vehicle = v;
  loadCap = l;
  towingCap = t;
 }

 public double getLoadCap(){
  return loadCap;
 }

 public int getTowingCap(){
  return towingCap;
 }

 public String toString(){
  return (person + ", vehicle manufacturer:" + getManufName() + ", Cyclinder:" + getCycNum() + ", load Capacity:" + loadCap + ", towing capacity:" + towingCap);
 }
}
