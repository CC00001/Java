import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;//awt stands for Abstract Window Toolkits
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Scanner;

class FirstSwingDemo{

 public static final int WIDTH = 300;
 public static final int HEIGHT = 500;

 public static void main(String [] args){
  JFrame firstWindow = new JFrame(); //New JFrame
  JPanel panel = new JPanel();//Create a new JPanel
  BorderLayout BL = new BorderLayout();
  firstWindow.setSize(WIDTH, HEIGHT);
  //firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Nothing done when Frame closed
  firstWindow.setLayout(new BorderLayout());
  firstWindow.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

  JButton endButton = new JButton("Click here to end the program");//New end Button
  EndingListener buttonEar = new EndingListener();//New Ending listener, EndingListener had defined in EndingListener.java
  endButton.addActionListener(buttonEar);//Button registered to action listener
 
  JLabel aLabel = new JLabel("Sudoku Game!");
  
  /*firstWindow.getContentPane().setBackground(Color.ORANGE);
  //firstWindow.add(endButton);//Button added to Frame
  firstWindow.add(aLabel, BorderLayout.CENTER);//Adding Label
  firstWindow.add(aLabel);
  firstWindow.setVisible(true);//Visibility of frame set to true
  */ 
        Scanner input = new Scanner(System.in);
	int row = 0, col = 0, value = 0;
	//System.out.println("Sudoku Game: ");
        SudokuPuzzle puzzle;
        firstWindow.getContentPane().add(puzzle = new SudokuPuzzle());//Adding Label
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
	

   firstWindow.getContentPane().setBackground(Color.ORANGE);
  //firstWindow.add(endButton);//Button added to Frame
  firstWindow.add(aLabel, BorderLayout.CENTER);//Adding Label
  firstWindow.add(aLabel);
  firstWindow.setVisible(true);//Visibility of frame set to true
 }
}
