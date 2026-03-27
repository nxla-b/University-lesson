import javax.swing.*;
import java.awt.*;

public class Contingences {
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
        textArea. setLineWrap(true);/*Permet de suivre les reste des mots sur une autre ligne*/ 
        textArea.setForeground(Color.GREEN);
        textArea.setBackground(Color.BLACK);
        JScrollPane panel = new JScrollPane();
        panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); /*Principe de l'ascenseur*/
        fenetre.add(textArea,BorderLayout.CENTER);
        fenetre.add(text1, BorderLayout.SOUTH);
        fenetre.setVisible(true);
    }
}