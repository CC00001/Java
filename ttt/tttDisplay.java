import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

class tttDisplay extends JComponent{
 
 private static final int CELL_PIXELS = 50;
 private static final int PUZZLE_SIZE = 3;
 private static final int BOARD_PIXELS = CELL_PIXELS * PUZZLE_SIZE;
 private static final int TEXT_OFFSET = 15;
 private static final Font OBJECT_FONT = new Font("Sansserif", Font.BOLD, 24);

 private tttModel model;

 public tttDisplay(tttModel m){
  setBackground(Color.WHITE);
  model = m;
 }

 public void paintComponent(Graphics g){
   g.setColor(getBackground());
   g.fillRect(0, 0, getWidth(), getHeight());
   g.setColor(Color.BLACK);

   drawGridLines(g);
   drawCellValues(g);
 }

 public void drawGridLines(Graphics g){
   for(int i = 0; i <= PUZZLE_SIZE; i++){
    int acrossOrDown = i * CELL_PIXELS;
    g.drawLine(acrossOrDown, 0, acrossOrDown, BOARD_PIXELS);
    g.drawLine(0, acrossOrDown, BOARD_PIXELS, acrossOrDown);
   }
 }

 public void drawCellValues(Graphics g){
  g.setFont(OBJECT_FONT);
   for(int i = 0; i < PUZZLE_SIZE; i++){
    int yDisplacement = (i+1) * CELL_PIXELS - TEXT_OFFSET;
     for(int j = 0; j < PUZZLE_SIZE; j++){
      if(model.getVal(i, j) != 0){
       int xDisplacement = j * CELL_PIXELS + TEXT_OFFSET;
       g.drawString("" + model.getVal(i, j), xDisplacement, yDisplacement);
      }
     }
   }
 }


}

