public class exo2 {
    
    public static void main ( String[]args){
       // variable prixHT et tva 
        double prixHT = 100;
        double tva = 0.2 ;
       // calcul du prixTTC
        double prixTTC = prixHT * (1 + tva);

      // print du prixTTC
        System.out.println(prixTTC);
    }
}