class tttModel{

 private static int player;
 private static boolean[] squares;

 tttModel(){
  player = 0;
  squares = new boolean[9];
  for(int i = 0; i < squares.length; i++)
   squares[i] = false;
 }

 tttModel(int p){
  super();
  player = p;
 }

 public void setTurns(boolean[] s){
  for(int i = 0; i < s.length; i++){
   if(i % 2 == 0)
   s[i] = true;
   else if(i % 2 != 0)
   s[i] = false;
  }
 }

 public static boolean getTurns(){
  boolean flag = false;
   for(boolean square: squares)
    square = flag;
   return flag; 
 }

 public int getPlayer(){return player;}
 //public int getPlayer2(){return player2;}
 
 public static boolean isAllTrue(){
  boolean flag = false;
  for(int i = 0; i < squares.length; i++){
   if(squares[i] == true)
    flag = true;
  }
  return flag;
 }
}
