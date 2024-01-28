public class exo1 {
    public static void main(String[] args) {
        //tableau pour les noms des accessoires (tableau de chaînes de caractères)
        String[] accessoiresNoms = {"roue", "oreiller pour l'appui tete ", "volant", "led", "rétroviseur"};

        //tableau pour les prix HT des accessoires (tableau de nombres décimaux)
        double[] accessoiresPrixHT = {50.99, 30.00, 59.99, 8.75, 31.99};

        // Affichage des noms et des prix HT des accessoires à l'aide d'une boucle for
        for (int i = 0; i < accessoiresNoms.length; i++) {
            String nom = accessoiresNoms[i];
            double prixHT = accessoiresPrixHT[i];
            System.out.println("Nom de l'accessoire : " + nom + ", Prix HT : " + prixHT + " €");
        }
    }
}
