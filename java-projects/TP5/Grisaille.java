import javax.swing.*;
import java.awt.*;


public class Grisaille {
 public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    fenetre.setSize (500,300);
    fenetre.setLocation(0,0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextField carre = new JTextField();
    Gris gris = new Gris ();
    gris.setValeur (Integer.parseInt(args[0]));
    Color couleur = new Color(gris.getValeur(),gris.getValeur(),gris.getValeur());
    carre.setBackground (couleur);
    fenetre.add(carre);
    fenetre.setVisible(true);
 }
}