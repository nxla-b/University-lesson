 import javax.swing.*;
import java.awt.*;
 
 public class MainTexte {
 public static void main(String[] args) {
        // Créer une fenêtre JFrame
        JFrame fenetre = new JFrame("Texte");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 300); // Taille de la fenêtre
        // Ajouter notre composant personnalisé à la fenêtre
       Texte text = new Texte();
            
        fenetre.add(text);

        // Afficher la fenêtre
        fenetre.setVisible(true);
    }
}