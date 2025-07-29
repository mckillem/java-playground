package org.example.basics.itnetwork;

import java.util.Scanner;

public class Playground {
    public static void basics() {
        sestAzSedum();
    }

    public static void triAzPet() {
//        System.out.println("Ahoj, jak se jmenuješ?");
//        Scanner scanner = new Scanner(System.in);
//        String jmeno = scanner.nextLine();
//        System.out.println("Jaký jsi?");
//        String vlastnost = scanner.nextLine();
//        System.out.println(jmeno + " je "  + vlastnost);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej číslo k umocnění: ");
//        int cislo = Integer.parseInt(scanner.nextLine());
//        System.out.println("Výsledek: " + cislo * cislo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej poloměr kruhu (cm): ");
        double polomer = Double.parseDouble(scanner.nextLine());
        System.out.println("Obvod zadaného kruhu je: " + 2*Math.PI*polomer + " cm");
        System.out.println("Jeho obsah je: " + Math.PI*Math.pow(polomer, 2) + " cm^2");
    }

    public static void  sestAzSedum() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej jméno: ");
//        String jmeno = scanner.nextLine();
//
//        System.out.println("Zadej příjmení: ");
//        String prijmeni = scanner.nextLine();
//
//        System.out.println("Zadej svůj věk: ");
//        int vek = Integer.parseInt(scanner.nextLine());
//
//        System.out.println(jmeno.toUpperCase() + " " + prijmeni.toUpperCase());
//        System.out.println("Za rok ti bude " + (vek + 1) + " let.");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadejte delší slovo: ");
//        String delsiSlovo = scanner.nextLine();
//
//        System.out.println("Zadejte kratší slovo: ");
//        String kratsiSlovo = scanner.nextLine();
//
//        System.out.println("Slova se liší délkou o " + (delsiSlovo.length() - kratsiSlovo.length()) + " znaků");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej řetězec: ");
        String vstup = scanner.nextLine();

        System.out.println(vstup.toLowerCase().contains("itnetwork"));
    }
}
