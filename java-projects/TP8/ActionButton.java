import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionButton implements ActionListener{
    private JPanel panel;
    private Color couleur;

    public ActionButton(JPanel p, Color c) {
        this.panel = p;
        this.couleur = c;
    }

    @Override 
    public void actionPerformed(ActionEvent event) {
        panel.setBackground(couleur);
    }
}