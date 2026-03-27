import javax.swing.*;
import java.awt.*;

public class Damier {
    public static void main(String[] args) {
        // 1. Récupérer la taille depuis les arguments
        int taille = 5; // Valeur par défaut
        JFrame fenetre = new JFrame("Damier " + taille + "x" + taille);
        Dimension tailleInitiale = new Dimension(500, 500);
        Dimension tailleMinimale = new Dimension(300, 300);
        fenetre.setSize(tailleInitiale);
        fenetre.setMinimumSize(tailleMinimale);
        fenetre.setLocation(100, 100);
        
        // 5. Définir la disposition (GridLayout pour le damier)
        JPanel panneauDamier = new JPanel(new GridLayout(taille, taille, 1, 1));
        panneauDamier.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // 6. Créer les cases du damier
        for (int ligne = 0; ligne < taille; ligne++) {
            for (int colonne = 0; colonne < taille; colonne++) { /*vu que la valeur de la ligne et celle de la colonnes sont pareil on a utiliser celle de la taille*/
                JPanel casePanel = new JPanel();
                // Alternance des couleurs
                if ((ligne + colonne) % 2 == 0) {
                    casePanel.setBackground(Color.WHITE);
                } else {
                    casePanel.setBackground(Color.CYAN);
                }
                panneauDamier.add(casePanel);
            }
        }
        fenetre.add(panneauDamier);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}
