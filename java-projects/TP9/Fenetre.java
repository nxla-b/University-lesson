import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre(){ //constructeur
    super("Fenêtre"); // vu que c'est un extends cela nous évite de faire un JFrame fenetre = new JFrame("Fenêtre");
    this.setSize(700, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);    
    }
}