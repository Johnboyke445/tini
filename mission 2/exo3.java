import java.util.Scanner;

public class exo3 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demande le code secret à l'utilisateur
        System.out.print("Veuillez saisir le code secret pour accéder à l'application (ex: 'JoJo') : ");
        String codeSecret = sc.nextLine();

        // Vérifie si le code secret est correct
        if   (!codeSecret.equalsIgnoreCase("JoJo")) {
            System.out.println("Code secret incorrect. Vous n'êtes pas autorisé à utiliser l'application.");
            sc.close();
            return; // Arrête le programme si le code secret est incorrect
        }

        String modele;
        String marque;
        double tva; // La TVA sera déterminée en fonction de la réponse de l'utilisateur
        double prixht;
        double prixttc;

        System.out.print("Saisir la marque du véhicule souhaité (ex: Mazda) : ");
        marque = sc.nextLine();
        System.out.print("Saisir le modèle du véhicule souhaité (ex: Miata) : ");
        modele = sc.nextLine();
        System.out.print("Le véhicule est-il électrique ? (Répondez avec 'oui' ou 'non') : ");
        String reponseElectrique = sc.next();

        // Vérifie la réponse de l'utilisateur pour déterminer la TVA
        if (reponseElectrique.equalsIgnoreCase("oui")) {
            tva = 0.05; // TVA à 5% pour les véhicules électriques
        } else if (reponseElectrique.equalsIgnoreCase("non")) {
            tva = 0.2; // TVA à 20% pour les véhicules non électriques
        } else {
            System.out.println("Réponse invalide. Veuillez répondre avec 'oui' ou 'non'.");
            sc.close();
            return;
        }

        System.out.print("Saisir le prix hors taxe du véhicule souhaité : ");
        prixht = sc.nextDouble();

        prixttc = prixht + (prixht * tva);

        // Applique une réduction de 100 euros sur le prix TTC si le prix hors taxe est supérieur à 20 000 euros
        if (prixht > 20000) {
            prixttc -= 100;
        }

        System.out.println("Le prix toutes taxes comprises du modèle " + marque + " " + modele + " est de " + prixttc + " euros.");
        System.out.println("Le prix hors taxes est de " + prixht + " euros.");

        sc.close();
    }
}




