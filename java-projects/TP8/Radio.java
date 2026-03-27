import javax.swing.*;
import java.awt.*;

public class Radio {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Couleur");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        fenetre.setLayout(layout);

        JPanel panel = new JPanel();
        ButtonGroup color = new ButtonGroup(); // Pour cliquer sur un seul boutons radio à la fois
        JRadioButton Cyan = new JRadioButton("Cyan");
        color.add(Cyan);
        panel.add(Cyan);
        Cyan.addActionListener(new ActionButton(panel, Color.CYAN));

        JRadioButton Magenta = new JRadioButton("Magenta");
        color.add(Magenta);
        panel.add(Magenta);
        Magenta.addActionListener(new ActionButton(panel, Color.MAGENTA));

        JRadioButton Jaune = new JRadioButton("Jaune");
        color.add(Jaune);
        panel.add(Jaune);
        Jaune.addActionListener(new ActionButton(panel, Color.YELLOW));

        fenetre.add(panel);

        fenetre.pack();

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);  
    }
}
