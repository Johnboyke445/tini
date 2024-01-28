import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de spécifier le nombre de produits à traiter
        System.out.print("Veuillez entrer le nombre de produits à traiter : ");
        int n = sc.nextInt();

        // Déclaration des variables pour les informations du produit
        String modele;
        String marque;
        double tva = 0.2;
        double prixht;
        double prixttc;

        // Boucle pour traiter chaque produit
        for (int i = 0; i < n; i++) {
            System.out.println("Produit #" + (i + 1));

            // Saisie des informations du produit
            System.out.print("Saisir la marque du véhicule souhaité (ex: Tiny) : ");
            marque = sc.next();
            System.out.print("Saisir le modèle du véhicule souhaité (ex: car) : ");
            modele = sc.next();
            System.out.print("Saisir le prix hors taxe du véhicule souhaité : ");
            prixht = sc.nextDouble();
            sc.nextLine(); // consommer la ligne vide restante.

            // Calcul du prix TTC du produit
            prixttc = prixht + (prixht * tva);

            // Appliquer une réduction si le prix hors taxe est supérieur à 20 000 euros
            if (prixht > 20000) {
                prixttc = prixht - 1000; // Réduction de 1000 euros
            }

            // Afficher les informations sur le produit
            if ((marque + " " + modele).equalsIgnoreCase("Tiny car")) {
                System.out.println("Le prix toutes taxes comprises du modèle Tiny car est de " + prixttc + " euros.");
                System.out.println("Le prix hors taxes est de " + prixht + " euros.");
            } else {
                System.out.println("Le véhicule cherché n'a pas été trouvé dans notre base de données, veuillez vérifier la saisie.");
            }
        }

        // Message de sortie
        System.out.println("Merci et au revoir !");
        sc.close();
    }
}