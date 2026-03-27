import java.util.Arrays;

public class Tri {
    public static void main (String[]args){
        int[] tab = new int[args.length]; /* On veut le nombre le nombre d'argument qui se trouve dans le tableau*/
        int i = 0;
        for(i =0; i < args.length; i++){ /* Taille des argument (nb d'arguments)*/
            tab [i] = Integer.parseInt(args[i]); /*Boucle sur les arguments et les ajoutes au calcul*/
        } 
        Arrays.sort(tab); /* sort tri tt seul*/
        System.out.println(Arrays.toString(tab));
    }
}