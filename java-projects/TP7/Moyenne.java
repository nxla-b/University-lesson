import javax.swing.JComponent;
import java.awt.*;

public class Moyenne {
    private double somme;
    private int nombre;
    
    public Moyenne() {
        this.somme = 0;
        this.nombre = 0;
    }
    
    // Méthodes add pour chaque type primitif
    public void add(byte valeur) {
        somme = somme + valeur; //somme += valeur
        nombre++;
    }
    
    public void add(short valeur) {
        somme += valeur;
        nombre++;
    }
    
    public void add(int valeur) {
        somme += valeur;
        nombre++;
    }
    
    public void add(long valeur) {
        somme += valeur;
        nombre++;
    }
    
    public void add(float valeur) {
        somme += valeur;
        nombre++;
    }
    
    public void add(double valeur) {
        somme += valeur;
        nombre++;
    }
    
    public double getAverage() {
        if (nombre == 0) {
            return 0; 
        }
        return somme / nombre;
    }
}