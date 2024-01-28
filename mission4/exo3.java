 import java.util.Scanner;



public class exo3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Tableaux pour les noms des accessoires et les prix HT
        String[] accessoiresNoms = new String[taillePanier];
        double[] accessoiresPrixHT = new double[taillePanier];

        // Remplir le panier avec les noms et les prix HT des accessoires
        for (int i = 0; i < taillePanier; i++) {
            scanner.nextLine(); // consommer la nouvelle ligne restante
            System.out.print("Entrez le nom de l'accessoire " + (i + 1) + " : ");
            accessoiresNoms[i] = scanner.nextLine();

            System.out.print("Entrez le prix HT de " + accessoiresNoms[i] + " : ");
            accessoiresPrixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et des prix HT des accessoires du panier
        System.out.println("Liste des accessoires dans le panier (nom, prixHT) :");

        double sommeTotale = 0;

        for (int i = 0; i < taillePanier; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];
            sommeTotale += prixHT;
            System.out.println("Nom de l'accessoire : " + nom + ", Prix HT : " + prixHT + " €");
        }

        // Affichage de la somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");
    }
}

