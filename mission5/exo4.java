import java.util.Scanner;

public class exo4 {

    // Nouvelle fonction pour calculer le prix TTC d'un accessoire
    public static double calculerPrixTTC(double prixHT) {
        // Appliquer la TVA de 20%
        double tva = 0.20;
        return prixHT * (1 + tva);
    }

    // Nouvelle procédure pour afficher un texte descriptif d'un accessoire avec prix TTC
    public static void afficherDescriptifAccessoire(String nom, double prixHT, double prixTTC) {
        System.out.println("Accessoire : " + nom + ", Prix HT : " + prixHT + " €, Prix TTC : " + prixTTC + " €");
    }

    // Nouvelle procédure pour afficher les éléments des tableaux
    public static void afficherElementsTableaux(String[] noms, double[] prixHT, double[] prixTTC) {
        System.out.println("Affichage des éléments des tableaux :");

        for (int i = 0; i < noms.length; i++) {
            System.out.println("Index " + i + ": Nom = " + noms[i] + ", Prix HT = " + prixHT[i] + " €, Prix TTC = " + prixTTC[i] + " €");
        }
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

    // Nouvelle fonction pour calculer la moyenne des prix HT
    public static double calculerMoyennePrixHT(double[] prixHT) {
        double somme = 0;
        for (double prix : prixHT) {
            somme += prix;
        }
        return somme / prixHT.length;
    }

    // Nouvelle fonction pour trouver le prix HT minimal
    public static double trouverPrixHTMinimal(double[] prixHT) {
        double prixMinimal = Double.MAX_VALUE;
        for (double prix : prixHT) {
            if (prix < prixMinimal) {
                prixMinimal = prix;
            }
        }
        return prixMinimal;
    }

    // Nouvelle fonction pour trouver le prix HT maximal
    public static double trouverPrixHTMaximal(double[] prixHT) {
        double prixMaximal = Double.MIN_VALUE;
        for (double prix : prixHT) {
            if (prix > prixMaximal) {
                prixMaximal = prix;
            }
        }
        return prixMaximal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Tableaux pour les noms des accessoires, les prix HT et les prix TTC
        String[] accessoiresNoms = new String[taillePanier];
        double[] accessoiresPrixHT = new double[taillePanier];
        double[] accessoiresPrixTTC = new double[taillePanier];

        // Remplir le panier avec les noms et les prix HT des accessoires
        for (int i = 0; i < taillePanier; i++) {
            scanner.nextLine(); // Consommer la nouvelle ligne restante
            System.out.print("Entrez le nom de l'accessoire " + (i + 1) + " : ");
            accessoiresNoms[i] = scanner.nextLine();

            System.out.print("Entrez le prix HT de " + accessoiresNoms[i] + " : ");
            accessoiresPrixHT[i] = scanner.nextDouble();
        }

        // Calculer les prix TTC et peupler le tableau
        for (int i = 0; i < taillePanier; i++) {
            accessoiresPrixTTC[i] = calculerPrixTTC(accessoiresPrixHT[i]);
        }

        // Afficher les noms, prix HT et prix TTC des accessoires du panier
        System.out.println("Liste des accessoires dans le panier (nom, prixHT, prixTTC) :");

        for (int i = 0; i < taillePanier; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];
            double prixTTC = accessoiresPrixTTC[i];

            afficherDescriptifAccessoire(nom, prixHT, prixTTC);
        }

        // Utiliser la nouvelle procédure pour afficher tous les éléments des tableaux
        afficherElementsTableaux(accessoiresNoms, accessoiresPrixHT, accessoiresPrixTTC);

        // Utiliser les nouvelles fonctions pour afficher les statistiques
        System.out.println("Moyenne des prix HT : " + calculerMoyennePrixHT(accessoiresPrixHT) + " €");
        System.out.println("Prix HT minimal : " + trouverPrixHTMinimal(accessoiresPrixHT) + " €");
        System.out.println("Prix HT maximal : " + trouverPrixHTMaximal(accessoiresPrixHT) + " €");
    }
}
