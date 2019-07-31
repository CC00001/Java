import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JTextField;

class ttt extends JFrame{

 private tttModel _tttLogic = new tttModel();
 //private tttDisplay _tttBoard = new tttDisplay(_tttLogic);
 private tttModel player = new tttModel();
 
 public JTextField player1Btn = new JTextField();
 public JTextField player2Btn = new JTextField();

 public ttt(){ //Constructor
  JPanel content = new JPanel();
  JButton one = new JButton("");
  JButton two = new JButton("");
  JButton three = new JButton("");
  JButton four = new JButton("");
  JButton five = new JButton("");
  JButton six = new JButton("");
  JButton seven = new JButton("");
  JButton eight = new JButton("");
  JButton nine = new JButton(""); 

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
  //two.addActionListener(new twoListener());
  //three.addActionListener(new threeListener());
  //four.addActionListener(new fourListener());
  //five.addActionListener(new fiveListener());
  //six.addActionListener(new sixListener());
  //seven.addActionListener(new sevenListener());
  //eight.addActionListener(new eightListener());
  //nine.addActionListener(new nineListener());
  setContentPane(content);
  setTitle("Tac-Tic-Toe");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
 //Implement Listensers
 class oneListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   if(isPlayer())
   player1Btn.setText("O"); 
   else if(!isPlayer())
   player2Btn.setText("X");
  }
 }

  public boolean isPlayer(){
   boolean flag = false;
   if(player.getPlayer1() % 2 != 0)
   flag = true;
   else if(player1.getPlayer1() % 2 == 0)
   
   else if(player.getPlayer2() % 2 == 0)
   flag = false;
   return flag;
  }

 public static void main(String [] args){
   new ttt().setVisible(true);   
 
 }
}

