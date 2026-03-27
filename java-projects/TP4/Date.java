import javax.swing.*;
import java.awt.*;

public class Date {
    private final int annee;
    private final int mois;
    private final int jour;
public Date (int annee, int mois, int jour){
    this.annee = annee;
    this.mois = mois;
    this.jour = jour;
}

    public int getAnnee(){
        return annee;
    }
    public int getMois(){
        return mois;
    }

    public int getJour(){
        return jour;
    }

     @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", annee, mois, jour);
    }

}