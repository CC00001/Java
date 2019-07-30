import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

class ttt extends JFrame{

 private tttModel _tttLogic = new tttModel();
 private tttDisplay _tttBoard = new tttDisplay(_tttLogic);


 public ttt(){ //Constructor
  JPanel content = new JPanel();
  content.setLayout(new BorderLayout());
  content.add(_tttBoard, BorderLayout.CENTER);
  setContentPane(content);
  setTitle("Tac-Tic-Toe");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }

 public static void main(String [] args){
   new ttt().setVisible(true);   
 
 }
}

