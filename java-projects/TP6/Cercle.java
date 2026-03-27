import javax.swing.JComponent;
import java.awt.*;
 
public class Cercle extends JComponent {
  private Image cercle;
  public Cercle() {
    super();
    this.cercle = Toolkit.getDefaultToolkit().getImage("cercles.png");
  }
  @Override
  protected void paintComponent(Graphics pinceau) {
    Graphics secondPinceau = pinceau.create();
    if (this.isOpaque()) {
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
 
    secondPinceau.drawImage(this.cercle, 10, 20, this);
  }
}