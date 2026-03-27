import javax.swing.*;
import java.awt.*;

public class Fond {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Couleur");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        fenetre.setLayout(layout);

        JPanel panel = new JPanel();
        JButton Cyan = new JButton("Cyan");
        panel.add(Cyan);
        Cyan.addActionListener(new ActionButton(panel, Color.CYAN));

        JButton Magenta = new JButton("Magenta");
        panel.add(Magenta);
        Magenta.addActionListener(new ActionButton(panel, Color.MAGENTA));

        JButton Jaune = new JButton("Jaune");
        panel.add(Jaune);
        Jaune.addActionListener(new ActionButton(panel, Color.YELLOW));

        fenetre.add(panel);

        fenetre.pack();

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);  
    }
}
