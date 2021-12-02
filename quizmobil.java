package grafis;
 import java.awt.*;
  public class quizmobil extends Panel{
quizmobil(){
}
public void paint (Graphics g) {
g.setColor(Color.BLUE);
g.fillRect(0, 250, 350, 100);
g.fillRect(0, 200, 250, 60);
g.setColor(Color.BLACK);
g.drawRect(0, 250, 350, 100);
g.drawRect(0, 200, 250, 50);
g.setColor(Color.RED);
g.fillArc(30,300,100,100,0,360);
g.fillArc(200,300,100,100,0,360);
g.setColor(Color.BLACK);
g.drawArc(30,300,100,100,0,360);
g.drawArc(200,300,100,100,0,360);


      }
public static void main(String[] args) {
Frame f = new Frame ("QUIZ");
 quizmobil gp = new quizmobil();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   }