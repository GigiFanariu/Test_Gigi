package GroceryListApp.src;

import java.util.Scanner;

public class ScannerUtil {
    public static String readLine(Scanner scanner) {
        String name;
        do {
            while (!scanner.hasNext()) {
                System.out.println("Inserisci un dato valido per il nome del prodotto.");
                scanner.next();
            }
            name = scanner.nextLine().trim();
        } while (name.isEmpty());
        return name;
    }
    
    public static int readQuantity(Scanner scanner) {
        int quantity;
        do {
            System.out.println("Quantità da acquistare:");
            while (!scanner.hasNextInt()) {
                System.out.println("Inserisci un numero valido per la quantità.");
                scanner.next(); // Consuma l'input type errato per evitare il crush del programma
            }
            quantity = scanner.nextInt(); //Legge la quantità di prodotto da acquistare
            if (quantity <= 0) {
                System.out.println("Inserisci una quantità pari almeno a 1");
            }
        } while (quantity <= 0);
        return quantity;
    }
    
    public static float readPrice(Scanner scanner) {
        float price;
        do {
            System.out.println("Prezzo stimato:");
            while (!scanner.hasNextFloat()) {
                System.out.println("Inserisci un numero valido per il prezzo.");
                scanner.next(); // Consuma l'input type errato per evitare il crush del programma
            }
            price = scanner.nextFloat(); //Legge il prezzo stimato del prodotto
            if (price <= 0) {
                System.out.println("Inserisci un prezzo maggiore di 0");
            }
        } while (price <= 0);
        return price;
    }
    
    public static int readSortMethod(Scanner scanner) {
        int sort;
        System.out.println("Seleziona il criterio di ordinamento:");
        System.out.println("1. Ordine Alfabetico");
        System.out.println("2. Ordine di Prezzo");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Inserisci un numero valido.");
                scanner.next(); // Consuma l'input type errato per evitare il crush del programma
            }
            sort = scanner.nextInt(); //Legge il metodo di sorting (1 o 2)
            if (sort < 1 || sort > 2) {
                System.out.println("Inserisci un numero valido.");
            }
        } while (sort < 1 || sort > 2);
        
        return sort;
    }
}
