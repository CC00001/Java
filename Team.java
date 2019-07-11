class Team{

 String teamName, name1, name2, name3, name4;
 Competition competition1, competition2;

 
 public Team(String t, String n1, String n2, String n3, String n4, Competition c1, Competition c2){ // Constructor
  teamName = t;
  name1 = n1;
  name2 = n2;
  name3 = n3;
  name4 = n4; 
  competition1 = new Competition(c1);//Safe Competition Data type's copy constructor
  //competition1 = c1; //<----NOT Safe copy constructor
  competition2 = new Competition(c2);
 }

 public Team(Team o){ //Copy constructor with passed in same Data type of Team with only one Team variable called o
   if(o == null){
    System.out.println("Fatal Error!");
    System.exit(0);
   }
   teamName = o.teamName;
   name1 = o.name1;
   name2 = o.name2;
   name3 = o.name3;
   name4 = o.name4;
   competition1 = new Competition(o.competition1);
   competition2 = new Competition(o.competition2);
 }

 public void set_TeamName(String t){
  teamName = t;
 }

 public void set_name1(String n1){
  name1 = n1;
 }

 public void set_name2(String n2){
  name2 = n2;
 }

 public void set_name3(String n3){
  name3 = n3;
 }

 public void set_name4(String n4){
  name4 = n4;
 }

 public String toString(){
  return ("Team name: " + teamName + ", Name1: " + name1 + ", Name2: " + name2 + ", Name3: " + name3 + ", Name4: " + name4);
 }

 public static void main(String [] args){
  Competition comp1 = new Competition("Game 1", "Griant", "Rocket", 2018);
  Competition comp2 = new Competition(comp1); //Safe copy constructor which copied from comp1
  //Competition comp2 = comp1; //<-----This is NOT safe version of copy constructor

  Team t1 = new Team("Team 1", "Tom", "Jack", "Caral", "Mickey", comp1, comp2);
  Team t2 = new Team(t1);

  t2.set_TeamName("Team 2");
  comp2.set_CompName("Game 2");

  System.out.println(t1.toString());
  System.out.println(comp1.toString());
  System.out.println();
  System.out.println(t2.toString());
  System.out.println(comp2.toString());


 } 
}
