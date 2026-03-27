import javax.swing.*;
import java.awt.*;

public class Choix {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame("Grisaille"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(500, 300);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setLayout(null);/*Très importatnt pour les boutons radio*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         fenetre.setVisible(true);
    }
}