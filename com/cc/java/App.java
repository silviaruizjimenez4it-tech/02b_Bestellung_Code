package com.cc.java;
 
import java.io.Console;
 
public class App 
{
    public static void main(String[] args)
    {
        Console console = System.console();
        if (console == null) {
            System.err.println("Das Programm muss im Terminal ausgeführt werden.");
            return;
        }
        String food = "";
        String drink = "";
 
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger (1), Cheeseburger (2) oder Chilliburger (3)?");
        String burgerInput = console.readLine();
        int burgerChoice = Integer.parseInt(burgerInput.trim());
 
        switch (burgerChoice)
        {
            case 1:
                food = "Hamburger";
                break;
            case 2:
                food = "Cheeseburger";
                break;
            case 3:
                food = "Chilliburger";
                break;
            default:
                food = "Unbekannte Auswahl";
                break;
        }
 
        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
        String drinkAnswer = console.readLine().trim();
 
        if (drinkAnswer.equalsIgnoreCase("j"))
        {
            System.out.println("Cola (1), Fanta (2), Sprite (3)?");
            String drinkInput = console.readLine();
            int drinkChoice = Integer.parseInt(drinkInput.trim());
 
            switch (drinkChoice)
            {
                case 1:
                    drink = "Cola";
                    break;
                case 2:
                    drink = "Fanta";
                    break;
                case 3:
                    drink = "Sprite";
                    break;
                default:
                    drink = "Unbekannte Auswahl";
                    break;
            }
            System.out.println("Hier ist Ihre Bestellung: " + food + " und " + drink + ".");
        }
        else
        {
            System.out.println("Hier ist Ihre Bestellung: " + food + ".");
        }
        System.out.println("Vielen Dank, und Auf Wiedersehen!");
    }
}