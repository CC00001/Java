imporn javax.swing.JFrame;
import javax.swing.JButton;

class FirstSwingDemo{

 public static final int WIDTH = 300;
 public static final int HEIGHT = 200;

 public static void main(String [] args){
  JFrame firstWindow = new JFrame(); //New JFrame
  firstWindow.setSize(WIDTH, HEIGHT);
  firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Nothing done when Frame closed
  JButton endButton = new JButton("Click here to end the program");//New end Button
  EndingListener buttonEar = new EndingListener();//New Ending listener, EndingListener had defined in EndingListener.java
  endButton.addActionListener(buttonEar);//Button registered to action listener

  firstWindow.add(endButton);//Button added to Frame
  firstWindow.setVisible(true);//Visibility of frame set to true
 }
}
