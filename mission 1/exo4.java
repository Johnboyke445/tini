import java.util.Scanner;

public class exo4 {
    public static void main (String[]args){
        //scanner pour lire l'entrée   
        Scanner scanner = new Scanner(System.in);

        System.out.println("veuillez saisir la marque de la voiture : ");
         String marque = scanner.nextLine();

        System.out.println("veuillez saisir la modele de la voiture  : ");
         String modele = scanner.nextLine();

        // demande a l'utilisateur de saisir le prix HT de l'unité 
        System.out.println("veuillez saisir un le prixHT : ");
        int prixHT = scanner.nextInt();
        // demande de la tva 
         System.out.println("veuillez saisir un la tva (sous forme o.2) : ");
        double tva = scanner.nextDouble();
       // calcul du prixTTC
        double prixTTC = prixHT * (1 + tva );
       //affichage print 
        System.out.println("votre " + marque +"" + modele +" coute " + prixTTC);

       // fermer scanner
        scanner.close();

    }
       
}
