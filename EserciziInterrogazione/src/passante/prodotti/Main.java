package passante.prodotti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        int maxProducts = 0;

        try {
            System.out.println("Quanti prodotti vuoi aggiungere? >> ");
            maxProducts = ipt.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input non valido");
            System.exit(1);
        }

        Market MashaEOrso = new Market(maxProducts);

        for (int i = 0; i < maxProducts; i++) {
            System.out.println("Prodotto " + (i + 1) + ":");
            MashaEOrso.addProducts(new Prodotto(ipt));
        }

        System.out.println("Prodotti nel mercato:");
        MashaEOrso.printProducts();
    }
}
