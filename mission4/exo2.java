import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        // Tableau pour les noms des accessoires (tableau de chaînes de caractères)
        String[] accessoiresNoms = {"roue", "oreiller pour l'appui tête", "volant", "LED", "rétroviseur"};

        // Tableau pour les prix HT des accessoires (tableau de nombres décimaux)
        double[] accessoiresPrixHT = new double[accessoiresNoms.length];

        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le prix HT de chaque accessoire
        for (int i = 0; i < accessoiresNoms.length; i++) {
            System.out.print("Entrez le prix HT de " + accessoiresNoms[i] + " : ");
            accessoiresPrixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et des prix HT des accessoires à l'aide d'une boucle for
        System.out.println("Liste des accessoires (nom, prixHT) :");

        for (int i = 0; i < accessoiresNoms.length; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];
            System.out.println("Nom de l'accessoire : " + nom + ", Prix HT : " + prixHT + " €");
        }
    }
}