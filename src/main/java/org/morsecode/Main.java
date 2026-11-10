package org.morsecode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MorseCode converter = new MorseCode();
        boolean running = true;

        while (running) {
            System.out.println("\n1. Engelska -> Morse");
            System.out.println("2. Morse -> Engelska");
            System.out.println("3. Avsluta");
            System.out.print("Välj: ");
            String choice = input.nextLine().trim();

            try {
                switch (choice) {
                    case "1" -> {
                        System.out.print("Skriv text: ");
                        System.out.println(converter.toMorse(input.nextLine()));
                    }
                    case "2" -> {
                        System.out.print("Skriv morsekod (mellanslag mellan bokstäver): ");
                        System.out.println(converter.toEnglish(input.nextLine()));
                    }
                    case "3" -> running = false;
                    default -> System.out.println("Ogiltigt val, välj 1, 2 eller 3.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Fel: " + e.getMessage());
            }
        }
        System.out.println("Hej då!");
    }
}
