package com.cc.java;

import java.util.Scanner;

public class AppEigene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preise
        final double preisHamburger     = 3.50;
        final double preisCheeseburger  = 4.00;
        final double preisChiliBurger   = 4.50;
        final double preisPommes        = 2.50;
        final double preisChiliFries    = 3.00;
        final double preisSalat         = 3.50;
        final double preisCola          = 2.00;
        final double preisFanta         = 2.00;
        final double preisSprite        = 2.00;
        final double preisMenu          = 7.50; // Menü: 1 Burger + 1 Beilage + 1 Getränk

        // Summen
        double summeBurger   = 0.0;
        double summeBeilage  = 0.0;
        double summeDrink    = 0.0;
        double summeMenu     = 0.0;

        // Bestelllisten
        StringBuilder bestellungBurger   = new StringBuilder();
        StringBuilder bestellungBeilagen = new StringBuilder();
        StringBuilder bestellungDrinks   = new StringBuilder();
        StringBuilder bestellungMenues   = new StringBuilder();

        System.out.println("----------------------------");
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");

        // -------- Menüs (mehrfach, mit Wahlmöglichkeiten) --------
        System.out.print("Möchten Sie ein Menü bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.print("Wie viele Menüs möchten Sie? (0 = Ende): ");
                int mengeMenu = readInt(sc);
                if (mengeMenu <= 0) break;

                System.out.println("----------------------------");
                // Burgerwahl fürs Menü
                System.out.println("Bitte wählen Sie den Burger für das Menü:");
                System.out.println("1) Hamburger  2) Cheeseburger  3) Chilliburger");
                int burgerChoice = readInt(sc);
                String burgerName;
                switch (burgerChoice) {
                    case 1:
                        burgerName = "Hamburger";
                        break;
                    case 2:
                        burgerName = "Cheeseburger";
                        break;
                    case 3:
                        burgerName = "Chilliburger";
                        break;
                    default:
                        burgerName = "Unbekannter Burger";
                        break;
                }

                System.out.println("----------------------------");
                // Beilagewahl fürs Menü
                System.out.println("Bitte wählen Sie die Beilage für das Menü:");
                System.out.println("1) Pommes  2) Chili-Cheese Fries  3) Caesar Salat");
                int beilagenChoice = readInt(sc);
                String beilageName;
                switch (beilagenChoice) {
                    case 1:
                        beilageName = "Pommes";
                        break;
                    case 2:
                        beilageName = "Chili-Cheese Fries";
                        break;
                    case 3:
                        beilageName = "Caesar Salat";
                        break;
                    default:
                        beilageName = "Unbekannte Beilage";
                        break;
                }

                System.out.println("----------------------------");
                // Getränkewahl fürs Menü
                System.out.println("Bitte wählen Sie das Getränk für das Menü:");
                System.out.println("1) Cola  2) Fanta  3) Sprite");
                int drinkChoice = readInt(sc);
                String drinkName;
                switch (drinkChoice) {
                    case 1:
                        drinkName = "Cola";
                        break;
                    case 2:
                        drinkName = "Fanta";
                        break;
                    case 3:
                        drinkName = "Sprite";
                        break;
                    default:
                        drinkName = "Unbekanntes Getränk";
                        break;
                }

                bestellungMenues.append(mengeMenu)
                        .append("x Menü (")
                        .append(burgerName).append(" + ")
                        .append(beilageName).append(" + ")
                        .append(drinkName).append(")\n");
                summeMenu += mengeMenu * preisMenu;
            }
        }

        // -------- Burger (mehrfach, mit Menge) --------
       System.out.print("\nMöchten Sie Burger extra bestellen? (j/n): ");
        System.out.println("\nBurger-Auswahl (0 = Ende):");
        while (true) {
            System.out.println("1) Hamburger (" + preisHamburger + " €)");
            System.out.println("2) Cheeseburger (" + preisCheeseburger + " €)");
            System.out.println("3) Chilliburger (" + preisChiliBurger + " €)");
            System.out.print("Ihre Wahl: ");
            int wahl = readInt(sc);
            if (wahl == 0) break;

            System.out.print("Menge: ");
            int menge = readInt(sc);
            if (menge <= 0) continue;

            switch (wahl) {
                case 1:
                    bestellungBurger.append(menge).append("x Hamburger\n");
                    summeBurger += menge * preisHamburger;
                    break;
                case 2:
                    bestellungBurger.append(menge).append("x Cheeseburger\n");
                    summeBurger += menge * preisCheeseburger;
                    break;
                case 3:
                    bestellungBurger.append(menge).append("x Chilliburger\n");
                    summeBurger += menge * preisChiliBurger;
                    break;
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }

        // -------- Beilagen (mehrfach) --------
        System.out.print("\nMöchten Sie Beilagen extra dazu bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.println("1) Pommes (" + preisPommes + " €)");
                System.out.println("2) Chili-Cheese Fries (" + preisChiliFries + " €)");
                System.out.println("3) Caesar Salat (" + preisSalat + " €)");
                System.out.print("Ihre Wahl (0 = Ende): ");
                int wahl = readInt(sc);
                if (wahl == 0) break;

                System.out.print("Menge: ");
                int menge = readInt(sc);
                if (menge <= 0) continue;

                switch (wahl) {
                    case 1:
                        bestellungBeilagen.append(menge).append("x Pommes\n");
                        summeBeilage += menge * preisPommes;
                        break;
                    case 2:
                        bestellungBeilagen.append(menge).append("x Chili-Cheese Fries\n");
                        summeBeilage += menge * preisChiliFries;
                        break;
                    case 3:
                        bestellungBeilagen.append(menge).append("x Caesar Salat\n");
                        summeBeilage += menge * preisSalat;
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            }
        }

        // -------- Getränke (mehrfach) --------
        System.out.print("\nMöchten Sie Getränke extra dazu bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.println("1) Cola (" + preisCola + " €)");
                System.out.println("2) Fanta (" + preisFanta + " €)");
                System.out.println("3) Sprite (" + preisSprite + " €)");
                System.out.print("Ihre Wahl (0 = Ende): ");
                int wahl = readInt(sc);
                if (wahl == 0) break;

                System.out.print("Menge: ");
                int menge = readInt(sc);
                if (menge <= 0) continue;

                switch (wahl) {
                    case 1:
                        bestellungDrinks.append(menge).append("x Cola\n");
                        summeDrink += menge * preisCola;
                        break;
                    case 2:
                        bestellungDrinks.append(menge).append("x Fanta\n");
                        summeDrink += menge * preisFanta;
                        break;
                    case 3:
                        bestellungDrinks.append(menge).append("x Sprite\n");
                        summeDrink += menge * preisSprite;
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            }
        }

        // -------- Gesamtsumme --------
        double gesamt = summeBurger + summeBeilage + summeDrink + summeMenu;

        // -------- Ausgabe --------
        System.out.println("\n===== Ihre Bestellung =====");
        if (bestellungMenues.length()   > 0) System.out.println("Menüs:\n"    + bestellungMenues.toString().trim()   + " -> " + round(summeMenu)   + " €");
        if (bestellungBurger.length()   > 0) System.out.println("Burger:\n"   + bestellungBurger.toString().trim()   + " -> " + round(summeBurger)  + " €");
        if (bestellungBeilagen.length() > 0) System.out.println("Beilagen:\n" + bestellungBeilagen.toString().trim() + " -> " + round(summeBeilage) + " €");
        if (bestellungDrinks.length()   > 0) System.out.println("Getränke:\n" + bestellungDrinks.toString().trim()   + " -> " + round(summeDrink)   + " €");
        System.out.println("----------------------------");
        System.out.println("Gesamtpreis: " + round(gesamt) + " €");
        System.out.println("Bitte bezahlen Sie den Gesamtpreis: " + round(gesamt) + " € an der Kasse.");
        System.out.println("Vielen Dank für Ihre Bestellung!");


        sc.close();
    }

    // Hilfsfunktionen
    private static boolean ja(String s) {
        return s != null && (s.equalsIgnoreCase("j") || s.equalsIgnoreCase("ja") || s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes"));
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Bitte eine ganze Zahl eingeben: ");
            }
        }
    }

    private static String round(double v) {
        return String.format("%.2f", v);
    }
}
