import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demande le code secret à l'utilisateur
        System.out.print("Veuillez saisir le code secret pour accéder à l'application (ex: 'JoJo') : ");
        String codeSecret = sc.nextLine();

        // Vérifie si le code secret est correct
        if (!codeSecret.equalsIgnoreCase("JoJo")) {
            System.out.println("Code secret incorrect. Vous n'êtes pas autorisé à utiliser l'application.");
            sc.close();
            return; // Arrête le programme si le code secret est incorrect
        }

        String modele;
        String marque;
        double tva = 0.2; // La TVA par défaut est de 20%
        double prixht;
        double prixttc;

        // Demande à l'utilisateur de choisir entre trois options
        System.out.println("Choisissez une option :");
        System.out.println("1- Sans carte de fidélité");
        System.out.println("2- Avec carte Gold");
        System.out.println("3- Avec carte Platinium");
        System.out.print("Entrez le numéro de votre choix : ");
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                // Pas de réduction, TVA à 20%
                break;
            case 2:
                // Réduction de 20% pour les clients avec carte Gold
                tva = 0.2 - 0.2 * 0.2; // TVA à 20% - 20% de réduction
                break;
            case 3:
                // Réduction de 30% pour les clients avec carte Platinium
                tva = 0.2 - 0.2 * 0.3; // TVA à 20% - 30% de réduction
                break;
            default:
                System.out.println("Option invalide. Veuillez choisir 1, 2 ou 3.");
                sc.close();
                return; // Arrête le programme si l'option est invalide
        }

        sc.nextLine(); // Lire la ligne vide après le choix

        System.out.print("Saisir la marque du véhicule souhaité (ex: Mazda) : ");
        marque = sc.nextLine();
        System.out.print("Saisir le modèle du véhicule souhaité (ex: Miata) : ");
        modele = sc.nextLine();
        System.out.print("Le véhicule est-il électrique ? (Répondez avec 'oui' ou 'non') : ");
        String reponseElectrique = sc.nextLine();

        // Vérifie la réponse de l'utilisateur pour déterminer la TVA
        if (reponseElectrique.equalsIgnoreCase("oui") && choix == 3) {
            // Réduction supplémentaire de 15% pour les clients avec carte Platinium pour les véhicules électriques
            tva = tva - tva * 0.15;
        }

        System.out.print("Saisir le prix hors taxe du véhicule souhaité : ");
        prixht = sc.nextDouble();

        prixttc = prixht + (prixht * tva);

        System.out.println("Le prix toutes taxes comprises du modèle " + marque + " " + modele + " est de " + prixttc + " euros.");
        System.out.println("Le prix hors taxes est de " + prixht + " euros.");

        sc.close();
    }
}

