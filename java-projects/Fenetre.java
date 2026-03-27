import javax.swing.*;
// import java.awt.*;

public class Fenetre extends JFrame{
    public Fenetre() {
        super("Fenêtre");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
/*à partir de maintenant on utilise la méthode qu'on à crée Fenetre */