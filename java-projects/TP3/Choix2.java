import javax.swing.*;
import java.awt.*;

public class Choix2 {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame("Exercice 1 du TP3"); /*Pour ouvrir une fenêtre*/
         Dimension tailleInitiale = new Dimension(500, 300);
        Dimension taillePreferee = new Dimension(600, 300);
        Dimension tailleMinimale = new Dimension(500, 300);
        Dimension tailleMaximale = new Dimension(300, 300);
        
        fenetre.setSize(tailleInitiale);
        fenetre.setPreferredSize(taillePreferee);
        fenetre.setMinimumSize(tailleMinimale);
        fenetre.setMaximumSize(tailleMaximale);
         fenetre.setResizable(false);/*Empeche de redimensionner à l'infini */
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setLayout(null);/*Très important pour les boutons radio*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JRadioButton Bouton1 = new JRadioButton("Gryffondor");
         JRadioButton Bouton2 = new JRadioButton("Serdaigle");
         JRadioButton Bouton3 = new JRadioButton("Serpentard");
         JRadioButton Bouton4 = new JRadioButton("Poufsouffle");
          ButtonGroup group = new ButtonGroup();
        group.add(Bouton1);
        group.add(Bouton2);
        group.add(Bouton3);
        group.add(Bouton4);
         Bouton1.setBounds(30,40,200,20);  /*coté gauche, hauteur*/
         Bouton2.setBounds(30,80,200,20);  
        Bouton3.setBounds(30,120,200,20); 
        Bouton4.setBounds(30,160,200,20);
        fenetre.add(Bouton1);
        fenetre.add(Bouton2);
        fenetre.add(Bouton3);
        fenetre.add(Bouton4);
         fenetre.setVisible(true);
    }
}