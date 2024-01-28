import java.util.Scanner;

public class exo3 {
    public static void main (String[]args){
        //scanner pour lire l'entrée   
        Scanner scanner = new Scanner(System.in);

        // demande a l'utilisateur de saisir le prix HT de l'unité 
        System.out.println("veuillez saisir un le prixHT : ");
        int prixHT = scanner.nextInt();
        // demande de la tva 
         System.out.println("veuillez saisir un la tva (sous forme o.2) : ");
        double tva = scanner.nextDouble();
       // calcul du prixTTC
        double prixTTC = prixHT * (1 + tva );
       //affichage print 
        System.out.println("le prix total est : " + prixTTC);

       // fermer scanner
        scanner.close();

    }
       
}
