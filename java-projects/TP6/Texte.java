import javax.swing.*;
import java.awt.*;


public class Texte extends JComponent {
    @Override
     protected void paintComponent(Graphics pinceau) {
    // obligatoire : on crée un nouveau pinceau pour pouvoir le modifier plus tard
    Graphics secondPinceau = pinceau.create();
    // obligatoire : si le composant n'est pas censé être transparent
    if (this.isOpaque()) {
      // obligatoire : on repeint toute la surface avec la couleur de fond
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    // maintenant on dessine ce que l'on veut
    secondPinceau.setColor((new Color(128,0,128))); // Purple
      Font font = new Font("Arial", Font.BOLD, 24);
    secondPinceau.setFont (font);
    secondPinceau.drawString(">o<",70,50);
    
  }
 }