import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choix;

        do {
            String modele;
            String marque;
            double tva = 0.2;
            double prixht;
            double prixttc;

            System.out.print("Saisir la marque du véhicule souhaité (ex: Tiny) : ");
            marque = sc.nextLine();
            System.out.print("Saisir le modèle du véhicule souhaité (ex: car) : ");
            modele = sc.nextLine();
            System.out.print("Saisir le prix hors taxe du véhicule souhaité : ");
            prixht = sc.nextDouble();

            prixttc = prixht + (prixht * tva); 

            if (prixht > 20000) {
                prixttc = prixht - (100 * 10);
            }

            if ((marque + " " + modele).equalsIgnoreCase("Tiny car")) {
                System.out.println("Le prix toutes taxes comprises du modèle Tiny car est de " + prixttc + " euros.");
                System.out.println("Le prix hors taxes est de " + prixht + " euros.");
            } else {
                System.out.println("Le véhicule cherché n'a pas été trouvé dans notre base de données, veuillez vérifier la saisie.");
            }

            System.out.print("Voulez-vous calculer un autre produit ? (1 pour continuer, 0 pour quitter) : ");
            choix = sc.nextInt();
            sc.nextLine();

        } while (choix ==1);

        System.out.println("Merci pour votre utilisation ! Au revoir !");
        sc.close();
    }
}

