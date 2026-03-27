import javax.swing.*;
import java.awt.*;

public class Saisie {
    public static void main(String[] args){
          JFrame fenetre = new JFrame("Exercice 3"); /*Pour ouvrir une fenêtre*/
         fenetre.setSize(500, 300);
         fenetre.setLocation(0,0);/*Positionne en haut à gauche de la fenêtre*/
         fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JTextField text1 = new JTextField("Today will be a good day ^^");
        text1.setBounds(20,40,200,28);
        text1.setHorizontalAlignment(JLabel.CENTER);
        text1.setForeground(Color.GREEN);
        text1.setBackground(new Color(128,128,128));
        JTextArea textArea = new JTextArea("Hello everyone");
        textArea.setForeground(Color.GREEN);
        textArea.setBackground(Color.BLACK);
        fenetre.add(textArea,BorderLayout.CENTER);
        fenetre.add(text1, BorderLayout.SOUTH);
        fenetre.setVisible(true);
    }

}