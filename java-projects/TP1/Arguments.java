public class Arguments{
     public static void main (String[]args){
        String prenom1 = args[0];
        String prenom2 = args[1];
        String prenom3 = args[2];

        System.out.println("Bonjour " + args[0]);
        System.out.println("Bonjour " + args[1]);
        System.out.println("Bonjour " + args[2]);
       

     }
}

/*Pour plusieurs arguments : 
for (i = 0; i < args.length; i++){
Sytem.out.println ("Bonjour" + args[i])}