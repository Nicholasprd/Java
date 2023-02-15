import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class SuperMouse extends JFrame implements MouseListener {
  public SuperMouse(){
    setSize(300, 200);
    setVisible(true);
    addMouseListener(this);
  }  

  public void mouseClicked(MouseEvent cord){
    int x = cord.getX();
    int y = cord.getY();

    if (x >= 100 && x <= 150 && y >= 100 && y <= 150) {
      System.out.println("Você está com boa pontaria: " + x + "," + y);
    } else {
      System.out.println(x + "," + y);
    }
  }
 
  public void mouseEntered(MouseEvent x){
  }
 
  public void mouseExited(MouseEvent x){
  }
 
  public void mousePressed(MouseEvent x){
  }
  
  public void mouseReleased(MouseEvent x){
  }
}