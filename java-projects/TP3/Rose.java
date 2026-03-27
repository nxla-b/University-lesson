import javax.swing.*;
import java.awt.*;

public class Rose {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame("Rose"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(400, 400);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel panneau = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 5));
        panneau.add ( new JLabel("Mystral"));
          panneau.add ( new JLabel("Tramontane"));
            panneau.add ( new JLabel("Grec"));
          fenetre.add(panneau, BorderLayout.NORTH);
        
            JPanel panneau2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 8));
        panneau2.add ( new JLabel("Ponant"));
          panneau2.add ( new JLabel("    "));
            panneau2.add ( new JLabel("Levant"));
          fenetre.add(panneau2, BorderLayout.CENTER);

           JPanel panneau3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 8));
        panneau3.add ( new JLabel("Libeccio"));
          panneau3.add ( new JLabel("Marin"));
            panneau3.add ( new JLabel("Sirocco"));
          fenetre.add(panneau3, BorderLayout.SOUTH);
         
         fenetre.setVisible(true);
    }
}