import javax.swing.*;
import java.awt.*;
//On reprend le programme de Date et on ajoute les modifications nécessaire
public class Lendemain {
    private final int annee;
    private final int mois;
    private final int jour;

 public Lendemain(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }
        @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", annee, mois, jour);
    }

    // Méthode statique qui prend une Date et retourne le lendemain
    public static Date calculerLendemain(Date date) {
        int nouveauJour = date.getJour() + 1;
        int nouveauMois = date.getMois();
        int nouvelleAnnee = date.getAnnee();
        
         int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// Dernière date de chaque mois sans prendre en compte que c'est  une année bissextile
         if (nouveauJour > joursParMois[nouveauMois - 1]) {
            nouveauJour = 1;  // Premier du mois suivant
            nouveauMois++;    // Mois suivant
            
            // Vérifier si on dépasse décembre
            if (nouveauMois > 12) {
                nouveauMois = 1;  // Janvier
                nouvelleAnnee++;  // Année suivante
            }
         }
        return new Date(nouvelleAnnee, nouveauMois, nouveauJour);
    }
    
    public static Date calculerLendemainPrecis(Date date) {
        int nouveauJour = date.getJour() + 1;
        int nouveauMois = date.getMois();
        int nouvelleAnnee = date.getAnnee();
        
    
        return new Date(nouvelleAnnee, nouveauMois, nouveauJour);
    }

}

