import javax.swing.*;
import java.awt.*;

public class Sirocco {
    public static void main(String[] args) {

         JFrame fenetre = new JFrame("Exercice 1"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(500, 300);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel etiquette = new JLabel("Sirocco");
        etiquette.setHorizontalAlignment(JLabel.RIGHT);/*RIGHT/LEFT/CENTER*/
        etiquette.setVerticalAlignment(JLabel.BOTTOM);
        fenetre.add(etiquette, BorderLayout.CENTER);/*étiquette occupe l'ensemble de la fenêtre*/
         fenetre.setVisible(true);


    }
}