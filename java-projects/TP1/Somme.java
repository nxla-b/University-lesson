public class Somme {
    public static void main (String[]args){
        int calcul = 0;
        int i = 0;
        for(i = 0; i < args.length; i++){ /* Taille des argument (nb d'arguments)*/
            calcul += Integer.parseInt(args[i]); /*Boucle sur les arguments et les ajoutes au calcul*/
        }
        System.out.println("Affichage = " + calcul);
    }
}

/* Exemple de commande = naila@LAPTOP-QO3OGCSA:~/java-projects/TP1$ java Somme 1 3
Affichage = 4*/