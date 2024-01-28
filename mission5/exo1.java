import java.util.Scanner;

public class exo1 {

    // Nouvelle procédure pour afficher un texte descriptif d'un accessoire
    public static void afficherDescriptifAccessoire(String nom, double prixHT) {
        System.out.println("Accessoire : " + nom + ", Prix HT : " + prixHT + " €");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Tableaux pour les noms des accessoires et les prix HT
        String[] accessoiresNoms = new String[taillePanier];
        double[] accessoiresPrixHT = new double[taillePanier];

        // Remplir le panier avec les noms et les prix HT des accessoires
        for (int i = 0; i < taillePanier; i++) {
            scanner.nextLine(); //Consommer la nouvelle ligne restante
            System.out.print("Entrez le nom de l'accessoire " + (i + 1) + " : ");
            accessoiresNoms[i] = scanner.nextLine();

            System.out.print("Entrez le prix HT de " + accessoiresNoms[i] + " : ");
            accessoiresPrixHT[i] = scanner.nextDouble();
        }

        // Affichage les noms et les prix HT des accessoires du panier
        System.out.println("Liste des accessoires dans le panier (nom, prixHT) :");

        double sommeTotale = 0;
        double prixMinimum = Double.MAX_VALUE; // Initialisation avec une valeur maximale
        double prixMaximum = Double.MIN_VALUE; // Initialisation avec une valeur minimale

        for (int i = 0; i < taillePanier; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];
            sommeTotale += prixHT;

            if (prixHT < prixMinimum) {
                prixMinimum = prixHT;
            }

            if (prixHT > prixMaximum) {
                prixMaximum = prixHT;
            }

            // Utiliser la nouvelle procédure pour afficher le descriptif de chaque accessoire
            afficherDescriptifAccessoire(nom, prixHT);
        }

        // Affichage la somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        // Affichage l'accessoire le moins cher
        System.out.println("Accessoire le moins cher : " + findAccessoryName(accessoiresNoms, accessoiresPrixHT, prixMinimum) + " (" + prixMinimum + " €)");

        // Affichage l'accessoire le plus cher
        System.out.println("Accessoire le plus cher : " + findAccessoryName(accessoiresNoms, accessoiresPrixHT, prixMaximum) + " (" + prixMaximum + " €)");

        // Calculer et afficher le prix moyen
        double prixMoyen = sommeTotale / taillePanier;
        System.out.println("Prix moyen des accessoires : " + prixMoyen + " €");
    }

    // Fonction pour trouver le nom de l'accessoire correspondant à un certain prix HT
    public static String findAccessoryName(String[] accessoiresNoms, double[] accessoiresPrixHT, double prixRecherche) {
        for (int i = 0; i < accessoiresNoms.length; i++) {
            if (Double.compare(accessoiresPrixHT[i], prixRecherche) == 0) {
                return accessoiresNoms[i];
            }
        }
        return "Non trouvé";
    }
}