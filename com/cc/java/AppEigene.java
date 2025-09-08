package com.cc.java;

import java.util.Scanner;

public class AppEigene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preise food- integriert
        final double preisHamburger           = 3.50;
        final double preisCheeseburger        = 4.00;
        final double preisChiliburger         = 4.50;
        final double preisChickenburger       = 4.00;
        final double preisDobbleburger        = 7.00;
        final double preisChickenNugget(20er) = 9.75;

        // Preise Beilagen- integriert
        final double preisPommes              = 3.50;
        final double preisCurlyFries          = 3.50;
        final double preisKroketten           = 3.50;
        final double preisChiliCheeseFries    = 4.00;
        final double preisCesarSalat          = 3.00;

        // Preise Saucen- integriert
        final double preisKetchup             = 0.50;
        final double preisMayonaise           = 0.50;
        final double preisRemoulade           = 0.50;
        final double preisCurry               = 0.50;
        final double preisBBQ                 = 0.50;
        final double preisChiliCheese         = 0.50;
        final double preisSuessSauer          = 0.50;
        
        // Preise Getränke- integriert
        final double preisCola                = 2.00;
        final double preisFanta               = 2.00;
        final double preisSprite              = 2.00;
        final double preisEistee              = 2.00;
        final double preisKaffee              = 1.50;
        final double preisBier    (ab18)      = 3.00;    // Abfrage Volljährigkeit noch nicht integriert
        final double preisWasser              = 1.50;
        final double preisSaft                = 1.50;

        // Preise Dessert- integriert
        final double preisSoftEisSchoko       = 2.50;
        final double preisSoftEisErdbeer      = 2.50;
        final double preisSoftEisKaramell     = 2.50;
        final double preisHotBrownie          = 3.50;
        final double preisHotBrownieEis       = 5.00;
        final double preisObstsalat           = 2.00;
        final double preisChurrosChocolate    = 4.50;
        
        
        // Menü: 1 Burger + 1 Beilage + 1 Sauce + 1 Getränk
        final double preisMenu1               = 8.50;    // integriert
        final double preisMenu2               = 11.50;   // noch nicht integriert

        // Summen
        double summeBurger                    = 0.0;
        double summeBeilage                   = 0.0;
        double summeDrink                     = 0.0;
        double summeMenu                      = 0.0;
        double summeSaucen                    = 0.0;
        double summeDessert                   = 0.0;
       

        // Bestelllisten
        StringBuilder bestellungBurger   = new StringBuilder();
        StringBuilder bestellungBeilagen = new StringBuilder();
        StringBuilder bestellungDrinks   = new StringBuilder();
        StringBuilder bestellungMenues   = new StringBuilder();
        StringBuilder bestellungSaucen   = new StringBuilder();
        StringBuilder bestellungDessert  = new StringBuilder();
        

        System.out.println("----------------------------");
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");

        // -------- Menüs (mehrfach, mit Wahlmöglichkeiten) --------
        System.out.print("Möchten Sie ein Menü bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.print("Wie viele Menüs möchten Sie? (0 = Ende): ");
                int mengeMenu = readInt(sc);
                if (mengeMenu <= 0) break;
                bestellungMenues.append(mengeMenu)
                        .append("x Menü (")
                        .append(burgerName).append(" + ")
                        .append(beilageName).append(" + ")
                        .append(sauceName).append(" + ")
                        .append(drinkName).append(")\n");
                summeMenu += mengeMenu * preisMenu;
            }
        }
                System.out.println("----------------------------");
                // Burgerwahl fürs Menü
                System.out.println("Bitte wählen Sie den Burger für das Menü:");
                System.out.println("1) Hamburger  2) Cheeseburger  3) Chilliburger  4) Chickenburger");
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
                    case 4:
                        burgerName = "Chickenburger";
                        break;
                    default:
                        burgerName = "UnbekannterBurger";
                        break;
                }

                System.out.println("----------------------------");
                // Beilagewahl fürs Menü
                System.out.println("Bitte wählen Sie die Beilage für das Menü:");
                System.out.println("1) Pommes  2) Chili-Cheese Fries  3) Caesar Salat  4) Curly fries   5) Kroketten");
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
                    case 4:
                        beilageName = "CurlyFries";
                        break;
                    case 5:
                        beilageName = "Kroketten";
                        break;
                    default:
                        beilageName = "Unbekannte Beilage";
                        break;
                }

                System.out.println("----------------------------");
                // Saucewahl fürs Menü
                System.out.println("Bitte wählen Sie eine Sauce für das Menü:");
                System.out.println("1) Ketchup  2) Mayonaise  3) Remoulade  4) Curry   5)BBQ   6) Chili Cheese    7) Süß Sauer");
                int sauceChoice = readInt(sc);
                String sauceName;
                switch (sauceChoice) {
                    case 1:
                        sauceName = "Ketchup";
                        break;
                    case 2:
                        sauceName = "Mayonaise";
                        break;
                    case 3:
                        sauceName = "Remoulade";
                        break;
                    case 4:
                        sauceName = "Curry";
                        break;
                    case 5:
                        sauceName = "BBQ";
                        break;
                    case 6:
                        sauceName = "Chili Cheese";
                        break;
                    case 7:
                        sauceName = "Süß Sauer";
                        break;
                    default:
                        sauceName = "keine";
                        break;
                }
        
                System.out.println("----------------------------");
                // Getränkewahl fürs Menü
                System.out.println("Bitte wählen Sie das Getränk für das Menü:");
                System.out.println("1) Cola  2) Fanta  3) Sprite  4) Eistee  5) Kaffee   6) Wasser  7) Saft  8) Bier (ab 18)");
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
                    case 4:
                        drinkName = "Eistee";
                        break;
                    case 5:
                        drinkName = "Kaffee";
                        break;
                    case 6:
                        drinkName = "Wasser";
                        break;
                    case 7:
                        drinkName = "Saft";
                        break;
                    case 8:
                        drinkName = "Bier";
                        break;
                    default:
                        drinkName = "Unbekanntes Getränk";
                        break;
                }

        System.out.println("----------------------------");
        // -------- Menüs (mehrfach, mit Wahlmöglichkeiten) --------
        System.out.print("Möchten Sie ein Menü bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.print("Wie viele Menüs möchten Sie? (0 = Ende): ");
                int mengeMenu = readInt(sc);
                if (mengeMenu <= 0) break;
                bestellungMenues.append(mengeMenu)
                        .append("x Menü (")
                        .append(burgerName).append(" + ")
                        .append(beilageName).append(" + ")
                        .append(sauceName).append(" + ")
                        .append(drinkName).append(")\n");
                summeMenu += mengeMenu * preisMenu;
            }
        }

        // -------- Burger (mehrfach, mit Menge) --------
       System.out.print("\nMöchten Sie Burger extra bestellen? (j/n): ");
        System.out.println("\nBurger-Auswahl (0 = Ende):");
        while (true) {
            System.out.println("1) Hamburger (" + preisHamburger + " €)");
            System.out.println("2) Cheeseburger (" + preisCheeseburger + " €)b");
            System.out.println("3) Chilliburger (" + preisChiliurger + " €)");
            System.out.println("4) Chickenburger (" + preisChickenburger + " €)");
            System.out.println("5) Dobbleburger (" + preisDobbleburger + " €)");
            System.out.println("6) 20 Chicken Nuggets (" + preisChickenNuggets + " €)");
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
                case 4:
                    bestellungBurger.append(menge).append("x Chickenburger\n");
                    summeBurger += menge * preisChickenburger;
                    break;
                case 5:
                    bestellungBurger.append(menge).append("x Dobbleburger\n");
                    summeBurger += menge * preisDoppleburger;
                    break;
                case 6:
                    bestellungBurger.append(menge).append("x ChickenNuggets\n");
                    summeBurger += menge * preisChickenNuggets;
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
                System.out.println("4) Curly Fries (" + preisPommes + " €)");
                System.out.println("5) Kroketten (" + preisChiliFries + " €)");
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
                    case 4:
                        bestellungBeilagen.append(menge).append("x Curly Fries\n");
                        summeBeilage += menge * preisCurlyFries;
                        break;
                    case 5:
                        bestellungBeilagen.append(menge).append("x Kroketten\n");
                        summeBeilage += menge * preisKroketten;
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            }
        }

        // -------- Sauce (mehrfach) --------
        System.out.print("\nMöchten Sie Saucen extra dazu bestellen? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.println("1) Ketchup (" + preisKetchup + " €)");
                System.out.println("2) Mayonaise (" + preisMayonaise + " €)");
                System.out.println("3) Remoulade (" + preisRemoulade + " €)");
                System.out.println("4) Curry (" + preisCurry + " €)");
                System.out.println("5) BBQ (" + preisBBQ + " €)");
                System.out.println("6) Chili Cheese (" + preisChiliCheese + " €)");
                System.out.println("7) Süß Sauer (" + preisSuessSauer + " €)");
                System.out.print("Ihre Wahl (0 = Ende): ");
                int wahl = readInt(sc);
                if (wahl == 0) break;

                System.out.print("Menge: ");
                int menge = readInt(sc);
                if (menge <= 0) continue;

                switch (wahl) {
                    case 1:
                        bestellungSauces.append(menge).append("x Ketchup\n");
                        summeSauce += menge * preisKetchup;
                        break;
                    case 2:
                        bestellungSauces.append(menge).append("x Mayonaise\n");
                        summeSauce += menge * preisMayonaise;
                        break;
                    case 3:
                        bestellungSauces.append(menge).append("x Remoulade\n");
                        summeSauce += menge * preisRemoulade;
                        break;
                    case 4:
                        bestellungSauces.append(menge).append("x Curry\n");
                        summeSauce += menge * preisCurry;
                        break;
                    case 5:
                        bestellungSauces.append(menge).append("x BBQ\n");
                        summeSauce += menge * preisBBQ;
                        break;
                    case 6:
                        bestellungSauces.append(menge).append("x Chili Cheese\n");
                        summeSauce += menge * preisChiliCheese;
                    case 7:
                        bestellungSauces.append(menge).append("x Süß Sauer\n");
                        summeSauce += menge * preisSuessSauer;
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
                System.out.println("4) Eistee (" + preisEistee + " €)");
                System.out.println("5) Kaffee (" + preisKaffee + " €)");
                System.out.println("6) Wasser (" + preisWasser + " €)");
                System.out.println("7) Saft (" + preisSaft + " €)");
                System.out.println("2) Bier (" + preisBier + " €)");
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
                    case 4:
                        bestellungDrinks.append(menge).append("x Eistee\n");
                        summeDrink += menge * preisEistee;
                        break;
                    case 5:
                        bestellungDrinks.append(menge).append("x Kaffee\n");
                        summeDrink += menge * preisKaffee;
                        break;
                    case 6:
                        bestellungDrinks.append(menge).append("x Wasser\n");
                        summeDrink += menge * preisWasser;
                    case 7:
                        bestellungDrinks.append(menge).append("x Saft\n");
                        summeDrink += menge * preisSaft;
                        break;
                    case 8:
                        bestellungDrinks.append(menge).append("x Bier\n");
                        summeDrink += menge * preisBier;
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            }
        }

         // -------- Dessert (mehrfach) --------
        System.out.print("\nDarf ich Ihnen noch ein Dessert anbieten? (j/n): ");
        if (ja(sc.nextLine())) {
            while (true) {
                System.out.println("1) Softeis Schokolade (" + preisSoftEisSchoko + " €)");
                System.out.println("2) Softeis Erdbeere (" + preisSoftEisErdbeere + " €)");
                System.out.println("3) Softeis Karamell (" + preisSoftEisKaramell + " €)");
                System.out.println("4) Hot Brownie (" + preisEistee + " €)");
                System.out.println("5) Hot Brownie mit Eis (" + preisHotBrownie + " €)");
                System.out.println("6) Obstsalat (" + preisHotBrownieEis + " €)");
                System.out.println("7) Churros Chocolate (" + preisChurrosChocolate + " €)");
                System.out.print("Ihre Wahl (0 = Ende): ");
                int wahl = readInt(sc);
                if (wahl == 0) break;

                System.out.print("Menge: ");
                int menge = readInt(sc);
                if (menge <= 0) continue;

                switch (wahl) {
                    case 1:
                        bestellungDesserts.append(menge).append("x Softeis Schokolade\n");
                        summeDessert += menge * preisSoftEisSchoko;
                        break;
                    case 2:
                        bestellungDesserts.append(menge).append("x Softeis Erdbeere\n");
                        summeDessert += menge * preisSoftEisErdbeere;
                        break;
                    case 3:
                        bestellungDesserts.append(menge).append("x Softeis Karamell\n");
                        summeDessert += menge * preisSoftEisKaramell;
                        break;
                    case 4:
                        bestellungDesserts.append(menge).append("x Hot Brownie\n");
                        summeDessert += menge * preisHotBrownie;
                        break;
                    case 5:
                        bestellungDesserts.append(menge).append("x Hot Brownie mit Eis\n");
                        summeDessert += menge * preisHotBrownieEis;
                        break;
                    case 6:
                        bestellungDesserts.append(menge).append("x Obstsalat\n");
                        summeDessert += menge * preisObstsalat;
                    case 7:
                        bestellungDesserts.append(menge).append("x Churros Chocolate\n");
                        summeDessert += menge * preisChurrosChocolate;
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            }
        }
        
        // -------- Gesamtsumme --------
        double gesamt = summeBurger + summeBeilage + summeSaucen + summeDrink + summeDessert + summeMenu;

        // -------- Ausgabe --------
        System.out.println("\n===== Ihre Bestellung =====");
        if (bestellungMenues.length()   > 0) System.out.println("Menüs:\n"    + bestellungMenues.toString().trim()   + " -> " + round(summeMenu)   + " €");
        if (bestellungBurger.length()   > 0) System.out.println("Burger:\n"   + bestellungBurger.toString().trim()   + " -> " + round(summeBurger)  + " €");
        if (bestellungBeilagen.length() > 0) System.out.println("Beilagen:\n" + bestellungBeilagen.toString().trim() + " -> " + round(summeBeilage) + " €");
        if (bestellungDrinks.length()   > 0) System.out.println("Getränke:\n" + bestellungDrinks.toString().trim()   + " -> " + round(summeDrink)   + " €");
        if (bestellungSauce.length() > 0) System.out.println("Sauce:\n"       + bestellungSaucen.toString().trim()   + " -> " + round(summeSauce) + " €");
        if (bestellungDessert.length()   > 0) System.out.println("Dessert:\n" + bestellungDessert.toString().trim()  + " -> " + round(summeDessert)   + " €");
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
