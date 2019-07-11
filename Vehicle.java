class Vehicle{

 private String manufName;
 private int cycNum;
 private Person person;

 Vehicle() {
  manufName = "Toyota";
  cycNum = 4;
  person = new Person("Charles");
 }

 Vehicle(String m, int c, Person p){
  manufName = m;
  cycNum = c;
  person = new Person(p);
 }

 public String getManufName(){
  return manufName;
 }

 public int getCycNum(){
  return cycNum;
 }

 public Person getPerson(){
  return person;
 }

 public void setManufName(String m){
  manufName = m;
 }

 public void setCycNum(int c){
  cycNum = c;
 }

 public void setPerson(Person p){
  person = new Person(p);
 }

}

