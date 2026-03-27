 import javax.swing.*;
import java.awt.*;
 
 public class MainCarre {
 public static void main(String[] args) {
        // Créer une fenêtre JFrame
        JFrame fenetre = new JFrame("Carré Bordé de Bleu");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 300); // Taille de la fenêtre
        // Ajouter notre composant personnalisé à la fenêtre
        Carre carre = new Carre();
            
        fenetre.add(carre);

        // Afficher la fenêtre
        fenetre.setVisible(true);
    }
}