import javax.swing.*;
import java.awt.*;

public class Boutons {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Exercice 2");
    fenetre.setSize(950, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fenetre.setLayout(null);
    JButton bouton = new JButton("Il fait froid aujourd'hui");/*Créer le bouton*/
    bouton.setBounds(50,100,150,40); /*Définir la position du bouton*//*x =50 y =100*/
    fenetre.add(bouton);
    JButton bouton2 = new JButton("Le soleil brille dehors");
        bouton2.setBounds(210, 100, 150, 40); // x=210 (50+150+10 d'espace)
        fenetre.add(bouton2);
    JButton bouton3 = new JButton("On est Lundi");
        bouton3.setBounds(370, 100, 150, 40); 
        fenetre.add(bouton3);
    JButton bouton4 = new JButton("Au travaille");
        bouton4.setBounds(530, 100, 150, 40); /*On rajoute 160 à x*/
        fenetre.add(bouton4);
        JButton bouton5 = new JButton("Bonne journée");
        bouton5.setBounds(690, 100, 150, 40); 
        fenetre.add(bouton5);
       fenetre.setVisible(true);
    }

}/*Il suffit de rajouter le texte */