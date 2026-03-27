public class Grille {
    public static void main (String[]args){
      int n = Integer.parseInt(args[0]);/*Convertie la valeur*/
      String horizontal ="";
      for(int i = 0; i < n; i++){
        horizontal +="+-"; 
      }
      horizontal += "+"; /*ce qui va à la fin */
      String vertical = "";
      for(int i = 0; i < n; i++){
        vertical +="| "; 
      }
      vertical += "|";
      for(int i = 0; i < n; i++){
        System.out.println(horizontal);
        System.out.println(vertical);
      } 
      System.out.println(horizontal);
    }
}
