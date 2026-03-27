import javax.swing.*;
import java.awt.*;

public class Essai2 {
    public static void main(String[] args) {
        Lendemain maDate = new Lendemain(2026,2,8);

        System.out.println(maDate);

        Date today = new Date (2026,2,8);
        Date demain = Lendemain.calculerLendemain(today);
        System.out.println(demain);
    }
}