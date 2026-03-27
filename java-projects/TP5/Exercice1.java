import javax.swing.*;
import java.awt.*;

//String se trouve dans le package java.lang
//Toutes les classes Java peuvent utiliser la méthode toString dont elles héritent en tant que classes filles de la classe Object.
// 5 méthodes sont transmise par la classe mère 
public class Exercice1 {
//toUpperCase = Majuscule
 public static void main(String[] args) {
       int number = Integer.parseInt (args[0], 8);
       System.out.println(Integer.toHexString(number));
}
}