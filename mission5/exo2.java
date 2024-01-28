import java.util.Scanner;

public class exo2 {

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

    // Fonction pour trouver le nom de l'accessoire correspondant à un certain prix HT
    public static String findAccessoryName(String[] accessoiresNoms, double[] accessoiresPrixHT, double prixRecherche) {
        for (int i = 0; i < accessoiresNoms.length; i++) {
            if (Double.compare(accessoiresPrixHT[i], prixRecherche) == 0) {
                return accessoiresNoms[i];
            }
        }
        return "Non trouvé";
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

        // Affichage les noms, prix HT et prix TTC des accessoires du panier
        System.out.println("Liste des accessoires dans le panier (nom, prixHT, prixTTC) :");

        for (int i = 0; i < taillePanier; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];


            double prixTTC = accessoiresPrixTTC[i];

            afficherDescriptifAccessoire(nom, prixHT, prixTTC);
        }

        
    }
} 