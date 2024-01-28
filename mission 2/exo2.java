import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
    
        String reponseElectrique = sc.next();

        // Vérifie la réponse de l'utilisateur pour déterminer la TVAe
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
        
        if (prixht > 20000) {
            prixttc = prixht - (100 * 10);
        }

        if ((marque + " " + modele).equalsIgnoreCase("Tiny car")) {
            System.out.println("Le prix toutes taxes comprises du modèle Tiny car est de " + prixttc + " euros.");
            System.out.println("Le prix hors taxes est de " + prixht + " euros.");
        } else {
            System.out.println("Le véhicule cherché n'a pas été trouvé dans notre base de données, veuillez vérifier la saisie.");
        }
       
        sc.close();
    }
}

