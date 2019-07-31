class tttModel{

 private static int player;
 private static boolean[] squares = new boolean[9];

 tttModel(){
  player = 0;
  for(int i = 0; i < squares.length; i++)
   squares[i] = false;
 }

 tttModel(int p){
  super();
  player = p;
 }

 public int getPlayer(){return player;}
 //public int getPlayer2(){return player2;}
}
