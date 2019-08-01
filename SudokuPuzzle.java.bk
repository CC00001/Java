/*Project 2 Sudoku Puzzle
 *
 *Group: WEI CHAO WU, Nicky Lin 
 *
 */

import java.util.Scanner;

public class SudokuPuzzle {
	
	private int board [][];
	private int start[][];
	
	public SudokuPuzzle(){
		start = new int [9][9];
		board = new int [9][9];
	}
	
	 public String toString(){
	 	String str = "Game Board:\n";
		for(int i = 0; i < 9; i++){
			for(int j = 0; j <9; j++){
				str += board[i][j] + " ";
			}
			str +="\n";
		}
		return str+"\n";
	}


	public void addInitial(int row, int col, int value){
		if (row>=0 && row<=9 && col >=0 && col <=9 && value >=1 && value <=9){
			start [row][col] = value;
			board [row][col] = value;
		}
	}
	
	public void addGuess(int row, int col, int value){
		
		if (row>=0 && row<=9 && col >=0 && col <=9 && value >=1 && value <=9 && start [row][col] == 0){
			board [row][col]= value;
		}
	}
	
	public int getValueIn(int row, int col){
		return board[row][col];
	}
	
	public void reset(){
		for (int i=0;i<9;i++)
			for( int j=0;j<9;j++)
				board[i][j] = start[i][j];
	}
	
	public boolean isFull(){
		boolean allFilled = true;
		for (int i=0;i<9;i++)
			for( int j=0;j<9;j++)
				allFilled = allFilled && board[i][j]>0;
		return allFilled;
	}
	
	public boolean[] getAllowedValues(int row, int col,int value){
		
		int savedValue = board[row][col];
		boolean result[] = new boolean[9];
		for (int v = 1; v <=9; v++){
			board [row][col] = value;
			result[v-1] = checkPuzzle(row,col,value);
		}
		board [row][col] = savedValue;
		return result;
	}
	
	public boolean checkPuzzle(int row, int col, int value){
	    boolean isValueNumber = true;

		for(int i = 0; i < 9; i++){
		  if (board[row][i] == value)
		  	return false;
		  if (board[i][col] == value)
		  	return false;
		  if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == value)
		  	return false;
		}
		return isValueNumber;
	}
	
	public static void initializePuzzle(SudokuPuzzle p){
	p.addInitial(0,0,1);
	p.addInitial(0,1,2);
	p.addInitial(0,2,3);
	p.addInitial(0,3,4);
	p.addInitial(0,4,9);
	p.addInitial(0,5,7);
	p.addInitial(0,6,8);
	p.addInitial(0,7,6);
	p.addInitial(0,8,5);
	p.addInitial(1,0,4);
	p.addInitial(1,1,5);
	p.addInitial(1,2,9);
	p.addInitial(2,0,6);
	p.addInitial(2,1,7);
	p.addInitial(2,2,8);
	p.addInitial(3,0,3);
	p.addInitial(3,4,1);
	p.addInitial(4,0,2);
	p.addInitial(5,0,9);
	p.addInitial(5,5,5);
	p.addInitial(6,0,8);
	p.addInitial(7,0,7);
	p.addInitial(8,0,5);
	p.addInitial(8,3,9);
	}
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int row = 0, col = 0, value = 0;
	System.out.println("Sudoku Game: ");
	SudokuPuzzle puzzle = new SudokuPuzzle();
	puzzle.initializePuzzle(puzzle);
	System.out.println("The puzzle is: \n" + puzzle);
	boolean work = false;

	
       while(!work){
	   System.out.println("What would you like to do?");
           System.out.println("1.Reset the puzzle");
           System.out.println("2.Start the game with a number:");
           System.out.println("3.Quit:"); 
           int ch = 0;
	   ch = input.nextInt();

    

	 switch (ch) {
	   case 1:
         puzzle.reset();
         break;

        case 2:
	  do{
           System.out.println("Enter the row number (1-9): ");
		    row = input.nextInt()-1;
		  System.out.println("Enter column number (1-9): "); 
		    col = input.nextInt()-1;
		  System.out.println("What should the value (1-9) be?");
			value = input.nextInt();
			puzzle.addGuess(row, col, value);
			System.out.print(puzzle);
	   }while(!puzzle.isFull());
		   break;
       
		case 3:
		System.out.println("Thanks for playing.");
			work = true;
		    break;

		 default: 
		 System.out.println("Invaild input.");
		 break;
		}

		System.out.println("The puzzle is now: " + puzzle);
			if(!puzzle.checkPuzzle(row,col,value))
					System.out.println("Error in the puzzle.");
			else if(puzzle.isFull())
					System.out.println("Congratulations.");
	  }
	}
}
