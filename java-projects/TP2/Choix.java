import javax.swing.*;
import java.awt.*;

public class Choix {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame("Exercice 4"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(500, 300);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setLayout(null);/*Très importatnt pour les boutons radio*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JRadioButton Bouton1 = new JRadioButton("Gryffondor");
         JRadioButton Bouton2 = new JRadioButton("Serdaigle");
         JRadioButton Bouton3 = new JRadioButton("Serpentard");
          ButtonGroup group = new ButtonGroup();
        group.add(Bouton1); //important les group.add
        group.add(Bouton2);
        group.add(Bouton3);
         Bouton1.setBounds(40,60,200,50);  
         Bouton2.setBounds(40,100,200,50);  
        Bouton3.setBounds(40,140,200,50); 
        fenetre.add(Bouton1);
        fenetre.add(Bouton2);
        fenetre.add(Bouton3);
         fenetre.setVisible(true);
    }
}