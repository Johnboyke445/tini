import java.util.Scanner;  

public class exo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crée un objet Scanner pour la saisie.

        String codeSecret = "JoJo"; // Définit le code secret pour accéder à l'application.
        int tentativesRestantes = 3; // Définit le nombre de tentatives autorisées.

        // Vérification du code secret
        while (tentativesRestantes > 0) { // Boucle pour gérer les tentatives restantes.
            System.out.print("Veuillez saisir le code secret pour accéder à l'application : ");
            String saisieCode = sc.nextLine(); // Saisie du code par l'utilisateur.

            if (saisieCode.equals(codeSecret)) { // Vérifie si le code est correct.
                System.out.println("Code secret correct. Accès autorisé.");
                break; // Sort de la boucle car le code est correct.
            } else {
                tentativesRestantes--; // Réduit le nombre de tentatives restantes.
                if (tentativesRestantes > 0) {
                    System.out.println("Code secret incorrect. Il vous reste " + tentativesRestantes + " tentative(s).");
                } else {
                    System.out.println("Accès refusé. Vous avez épuisé toutes les tentatives.");
                    sc.close();
                    return; // Programme terminé car les tentatives sont épuisées.
                }
            }
        }

        // Saisie des détails du véhicule
        String modele;
        String marque;
        double tva;
        double prixht;
        double prixttc;

        System.out.print("Saisir la marque du véhicule souhaité (ex: tiny) : ");
        marque = sc.nextLine(); // Saisie de la marque du véhicule.
        System.out.print("Saisir le modèle du véhicule souhaité (ex: car) : ");
        modele = sc.nextLine(); // Saisie du modèle du véhicule.

        System.out.print("Le véhicule est-il électrique ? (Répondez avec 'oui' ou 'non') : ");
        String reponseElectrique = sc.next(); // Saisie de la réponse sur l'électrique.

        // Vérification de la réponse de l'utilisateur pour déterminer la TVA
        if (reponseElectrique.equalsIgnoreCase("oui")) {
            tva = 0.05; // TVA à 5% pour les véhicules électriques.
        } else if (reponseElectrique.equalsIgnoreCase("non")) {
            tva = 0.2; // TVA à 20% pour les véhicules non électriques.
        } else {
            System.out.println("Réponse invalide. Veuillez répondre avec 'oui' ou 'non'.");
            sc.close();
            return; // Termine le programme si la réponse est invalide.
        }

        System.out.print("Saisir le prix hors taxe du véhicule souhaité : ");
        prixht = sc.nextDouble(); // Saisie du prix hors taxe.

        prixttc = prixht + (prixht * tva); // Calcul du prix TTC.

        // Applique une réduction de 100 euros sur le prix TTC si le prix hors taxe est supérieur à 20 000 euros.
        if (prixht > 20000) {
            prixttc -= 100;
        }

        if ((marque + " " + modele).equalsIgnoreCase("Tiny car")) {
            System.out.println("Le prix, toutes taxes comprises, du modèle Tiny car est de : " + prixttc + " euros.");
            System.out.println("Le prix hors taxes est de : " + prixht + " euros.");
        } else {
            System.out.println("Le véhicule que vous recherchez n'a pas été trouvé dans notre base de données, veuillez vérifier votre saisie.");
        }

        sc.close();
    }
}





