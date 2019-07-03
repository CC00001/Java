class Competition{

 String name_Competition, name_WinningTeam, name_RunnerUp;
 int year_Competition;

 public Competition(String c, String w, String r, int y){ //Constructor
  name_Competition = c;
  name_WinningTeam = w;
  name_RunnerUp = r;
  year_Competition = y;
 }

 public Competition(Competition o){ //Copy Constructor
  if(o == null){
   System.out.println("Fatal Error!");
   System.exit(0);
  }
  name_Competition = o.name_Competition;
  name_WinningTeam = o.name_WinningTeam;
  name_RunnerUp = o.name_RunnerUp;
  year_Competition = o.year_Competition;
 }
 
 public void set_CompName(String c){
  name_Competition = c;
 }  

 public void set_WinningTeam(String w){
  name_WinningTeam = w;
 }

 public void set_RunnerUp(String r){
  name_RunnerUp = r;
 }

 public void set_yearComp(int y){
  year_Competition = y; 
 }

 public String toString(){
  return ("Name of the Competition: " + name_Competition + " in " + year_Competition + ", the winning Team is: " + name_WinningTeam + ", and the Runner up name is: " + name_RunnerUp);
 }
 

}
