 import javax.swing.*;
import java.awt.*;
 
 public class MainCercle {
 public static void main(String[] args) {
        // Créer une fenêtre JFrame
        JFrame fenetre = new JFrame("Cercle");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 300); // Taille de la fenêtre
        // Ajouter notre composant personnalisé à la fenêtre
     Cercle cercle = new Cercle();
            
        fenetre.add(cercle);

        // Afficher la fenêtre
        fenetre.setVisible(true);
    }
}