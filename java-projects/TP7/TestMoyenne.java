public class TestMoyenne {
    public static void main(String[] args) {
        Moyenne2 moy = new Moyenne2();
        
        // Les types primitifs sont automatiquement convertis en objets (auto-boxing)
        moy.add((byte) 10);    // byte
        moy.add((short) 20);   // short  
        moy.add((int)30);           // int
        moy.add((long)40L);          // long
        moy.add((float)50.5f);        // float
        moy.add((double)60.6);         //double 
        
        System.out.println("Moyenne : " + moy.getAverage());
    }
}