class Sudoku{

 private static int row, col, size, num = 0;
 private static int [][] board;
 private static int [][] start;
 Sudoku(){
  row = 0;
  col = 0;
  size = 0;
  board = new int[size][size];
  start = new int[size][size];
 }

 Sudoku(int r, int c, int s){
  row = r;
  col = c;
  size = s;
  board = new int[s][s];
  start = new int[s][s];
 }

 public static int [][]  initBoard(){
  for(row = 0; row < board.length; row++){
   for(col = 0; col < board.length; col++){
    board[row][col] = 0;
   }
  } 
 return board;
 }

 public static void Display(){
   for(row = 0; row < board.length; row++){
    for(col = 0; col < board.length; col++){
     System.out.print(board[row][col] + " ");
     if(col == board.length - 1) System.out.print("\n");//If col achives 10, then make a new line
    }
   }
  System.out.println(); 
 }

 int generateRandNum(int num){
  return (int)Math.floor((Math.random() * num + 1));
 }

 public static void addInital(int r, int c, int v){	
     if(r >= 1 && r <= 9 && c >= 1 && c <=9 && v >= 1 && v <= 9){
      board[r][c] = v;
      start[r][c] = v;
   }
 }

 public static void addGuess(int r, int c, int v){
   if(r >= 1 && r <= 9 && c >= 1 && c <=9 && v >= 1 && v <= 9)
      board[r][c] = v; 
 }

 public int getValueIn(int r, int c){
   return board[r][c];
 }

 public void reset(){
  for(int i = 0; i < size; i++){
   for(int j = 0; j < size: j++){
    board[i][j] = start[i][j];
   }
  }
 }

 public String toString(){
  String str_puzzle = "    1  2  3  4  5  6  7  8  9\n";
  str_puzzle = str_puzzle + "  -----------------------------\n";

   for(int i = 0; i < size; i++){
     str_puzzle = str_puzzle + (i + 1) + " |";
      for(int j = 0; j < size; j++){
       if(board[i][j] == 0) str_puzzle = str_puzzle + " " + "0|";
       else str_puzzle = str_puzzle + " " + board[i][j] + "|";
      }
      str_puzzle = str_puzzle + "\n";
      str_puzzle = str_puzzle + "  |__|__|__|__|__|__|__|__|__|\n";
   }
  return str_puzzle;
 }

 public static void main(String [] args){ 
  Sudoku s1 = new Sudoku(0, 0, 9);
  System.out.print(s1);
  //int [][] board = new int[s1.size][s1.size];
  //initBoard();
  addInital(3, 8, 5);
  Display();

 }

}
