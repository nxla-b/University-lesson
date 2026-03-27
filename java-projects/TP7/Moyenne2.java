import javax.swing.JComponent;
import java.awt.*;

public class Moyenne2 {
    private double somme;
    private int nombre;
    
    public Moyenne2() {
        this.somme = 0;
        this.nombre = 0;
    }
    
    // Une seule méthode add acceptant n'importe quel type héritant de Number
    public void add(Number valeur) {
        somme += valeur.doubleValue();
        nombre++;
    }
    
    public double getAverage() {
        if (nombre == 0) {
            return 0; 
        }
        return somme / nombre;
    }
}