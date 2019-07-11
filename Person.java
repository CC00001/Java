class Person{
 private String name;
 
 Person(){name = "Charles";}
 
 Person(String theName){
  name = theName;
 }

 Person(Person o){//Copy constructor
  this.name = o.name;
 }

 public String getName(){
  return name;
 }

 public void setName(String n){
  name = n;
 }

 public String toString(){
  return ("Person Name:" + name);
 }

 /*public boolean equals(Object){
 
 }*/
}
