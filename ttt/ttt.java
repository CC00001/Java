import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JTextField;

class ttt extends JFrame{

 private tttModel _tttLogic = new tttModel();
 
 private static tttModel currentPlayer; 
 private tttModel player1, player2;
 private JButton one, two, three, four, five, six, seven, eight, nine;

 //public JTextField player1Btn = new JTextField("O");
 //public JTextField player2Btn = new JTextField("X");

 public ttt(){ //Constructor
  JPanel content = new JPanel();
  one = new JButton("");
  two = new JButton("");
  three = new JButton("");
  four = new JButton("");
  five = new JButton("");
  six = new JButton("");
  seven = new JButton("");
  eight = new JButton("");
  nine = new JButton(""); 

  content.setLayout(new GridLayout(3, 3));
  content.add(one);
  content.add(two);
  content.add(three);
  content.add(four);
  content.add(five);
  content.add(six);
  content.add(seven);
  content.add(eight);
  content.add(nine);


  //Add Listener
  one.addActionListener(new oneListener());
  two.addActionListener(new twoListener());
  three.addActionListener(new threeListener());
  four.addActionListener(new fourListener());
  five.addActionListener(new fiveListener());
  six.addActionListener(new sixListener());
  seven.addActionListener(new sevenListener());
  eight.addActionListener(new eightListener());
  nine.addActionListener(new nineListener());
  setSize(400, 400);
  setContentPane(content);
  setTitle("Tic-Tac-Toe");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
 //Implement Listensers
 class oneListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   one.setText("O");
   else if(currentPlayer == player2)
   one.setText("X");
  }
 }

  class twoListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   two.setText("O");
   else if(currentPlayer == player2)
   two.setText("X");
  }
 }

class threeListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   three.setText("O");
   else if(currentPlayer == player2)
   three.setText("X");
  }
 }

class fourListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   four.setText("O");
   else if(currentPlayer == player2)
   four.setText("X");
  }
 }

class fiveListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   five.setText("O");
   else if(currentPlayer == player2)
   five.setText("X");
  }
 }

class sixListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   six.setText("O");
   else if(currentPlayer == player2)
   six.setText("X");
  }
 }

class sevenListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   seven.setText("O");
   else if(currentPlayer == player2)
   seven.setText("X");
  }
 }

class eightListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   eight.setText("O");
   else if(currentPlayer == player2)
   eight.setText("X");
  }
 }

class nineListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   takeTurns(player1, player2);
   if(currentPlayer == player1)
   nine.setText("O");
   else if(currentPlayer == player2)
   nine.setText("X");
  }
 }


/*public tttModel isPlayer1Turn(){
    if(player1.getTurns())
     player1 = new tttModel(0);
    else if(!player1.getTurns())
     player1 = new tttModel(1);
    return player1;
   }

   public tttModel isPlayer2Turn(){
    if(player2.getTurns())
     player2 = new tttModel(0);
    else if(player2.getTurns())
     player2 = new tttModel(1);
    return player2;
   }
  */
   public tttModel takeTurns(tttModel p1, tttModel p2){
     if(tttModel.getTurns())
      currentPlayer = p1;
     else if(!tttModel.getTurns())
      currentPlayer = p2;
    return currentPlayer;
   }

 public static void main(String [] args){
   new ttt().setVisible(true);   
 }
}

