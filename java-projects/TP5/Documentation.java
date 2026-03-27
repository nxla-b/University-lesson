import javax.swing.*;
import java.awt.*;

//String se trouve dans le package java.lang
//Toutes les classes Java peuvent utiliser la méthode toString dont elles héritent en tant que classes filles de la classe Object.
// 5 méthodes sont transmise par la classe mère 
public class Documentation {
//toUpperCase = Majuscule
 public static void main(String[] args) {
        String chaine = ""; // Parcours le tableau du début à la fin (à l'obligation d'aller à la fin )
        int i = 0;
        for (i =0; i<args.length; i++){
            chaine =  args[i]; //  IMPORTANT
            System.out.println(chaine.toUpperCase());
        }

}
}