import javax.swing.*;
import java.awt.*;

public class Question {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame("Question"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(400, 200);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         FlowLayout gestionnaire = new FlowLayout(FlowLayout.CENTER);
         fenetre.setLayout(gestionnaire);

         JPanel panneau = new JPanel();
         JButton bouton1 = new JButton("Oui");
         JButton bouton2 = new JButton("Non");
         JButton bouton3 = new JButton("NSPP");
         fenetre.add (panneau, BorderLayout.SOUTH);
         JLabel text = new JLabel("Aimez-vous les chiens ?");
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.BOTTOM);
         panneau.add(bouton1);
         panneau.add(bouton2);
         panneau.add(bouton3);
         fenetre.add(text, BorderLayout.CENTER);
         fenetre.add(panneau, BorderLayout.SOUTH);

         
            fenetre.setVisible(true);
    }
}