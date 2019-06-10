 package bank;
 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class BackGround extends JPanel{
 
   private Image image; 
	
   public BackGround() {
       
   image = new ImageIcon(getClass().getResource("/image/background.jpg")).getImage();
   }
 
   @Override
   protected void paintComponent(Graphics bg) {
       super.paintComponent(bg);
 
       Graphics2D gd = (Graphics2D) bg.create(); 

       gd.drawImage(image, 0, 0, getWidth(), getHeight(), null); 

       gd.dispose(); 
   }
  
}
