 import javax.swing.*;
import java.awt.*;
 
 public class MainDisque {
 public static void main(String[] args) {
        // Créer une fenêtre JFrame
        JFrame fenetre = new JFrame("Disque");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 300); // Taille de la fenêtre
        // Ajouter notre composant personnalisé à la fenêtre
        Disque disque = new Disque();
        fenetre.add(disque);

        // Afficher la fenêtre
        fenetre.setVisible(true);
    }
}