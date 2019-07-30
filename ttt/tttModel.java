class tttModel{

 private static final int BOARD_SIZE = 9;		
 private static char[][] board;

  
 public tttModel(){
  board = new char[BOARD_SIZE][BOARD_SIZE];
  initializeBoard();
 }

 public void initializeBoard(){
   int row, col;
   for(row = 0; row < BOARD_SIZE; row++){
    for(col = 0; col < BOARD_SIZE; col++){
     if(row > BOARD_SIZE || col > BOARD_SIZE)
      throw new IllegalArgumentException("Tic-Tac-Toe Model: Attemp to initialize out of range at row " + (row+1) + " and column " + (col+1));
      board[row][col] = ' ';
    }
   }
 }

 public void setVal(int r, int c, char v){
  board[r][c] = v;
 }

 public char getVal(int r, int c){
  return board[r][c];
 }

 public void clear(){
  for(int row = 0; row < BOARD_SIZE; row++){
   for(int col = 0; col < BOARD_SIZE; col++){
     setVal(row, col, ' ');
   }
  }
 }

}
