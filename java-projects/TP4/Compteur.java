import javax.swing.*;
import java.awt.*;
//D'abord on crée une méthode puis on passe au main 
public class Compteur {
    // attribut
    private int compte;
    
    // méthode = fonction
    public void plusUn() {
        this.compte++;
    }
    
    // méthode binaire
    public String binaire() {
        return Integer.toBinaryString(this.compte);
    }
    
    // Getter pour compte (lecture)
    public int getCompte() {
        return this.compte;
    }
    
    // Setter pour compte (écriture)
    public void setCompte(int valeur) {
        this.compte = valeur;
    }
    
    // main method - méthode principale pour exécuter le programme
    public static void main(String[] args) {
        Compteur compteur = new Compteur();
        
        for (int i = 5; i <= 9; i++) {
            compteur.setCompte(i);  // mettre le compteur à i
            System.out.println(compteur.binaire());// Affichage en binaire
        }
    }
}
