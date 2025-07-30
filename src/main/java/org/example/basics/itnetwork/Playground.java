package org.example.basics.itnetwork;

import java.util.Scanner;

public class Playground {
    public static void basics() {
        desetAzJedenact();
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

    public static void osmAzDevet() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej své jméno: ");
//        String jmeno = scanner.nextLine();
//
//        if (jmeno.length() <= 10 && jmeno.length() >= 3) {
//            System.out.println("Normální jméno.");
//        } else {
//            System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej smajlíka: ");
//        String smajlik = scanner.nextLine();
//
//        String text;
//        switch (smajlik) {
//            case ":-)":
//            case ":)":
//                text = "Tvůj smajlík je veselý";
//                break;
//            case ":-(":
//            case ":(":
//                text = "Tvůj smajlík je smutný";
//                break;
//            case ":-*":
//            case ":*":
//                text = "Tvůj smajlík je zamilovaný";
//                break;
//            case ":-P":
//            case ":P":
//                text = "Tvůj smajlík je s vyplazeným jazykem";
//                break;
//            default:
//                text = "Tvůj smajlík je neznámý";
//                break;
//        }
//
//        System.out.println(text);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 : ");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double diskriminant = b*b - 4*a*c;

        if (a == 0){
            System.out.println("Není kvadratická rovnice");
        } else if (diskriminant > 0) {
            double x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Rovnice má 2 reálné kořeny x1 = " + x1 + ", x2 = " + x2);
        } else if (diskriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Rovnice má jeden kořen x = " + x);
        } else if (diskriminant < 1) {
            System.out.println("Neexistuje řešení v oblasti reálných čísel");
        }
    }

    public static void desetAzJedenact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kolik ryb si dáš k večeři?");
//        int pocet = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < pocet; i++) {
//            System.out.println("<° )))-<");
//        }


//        for (int i = 10; i > 0; i--) {
//            if (i >= 5) {
//                System.out.println(i + " zelených láhví stojí na stole a jedna láhev spadne");
//            } else if (i > 1) {
//                System.out.println(i + " zelené láhve stojí na stole a jedna láhev spadne");
//            } else {
//                System.out.println(i + " zelená láhev stojí na stole a jedna láhev spadne");
//            }
//        }


        System.out.println("Kombinace hodů dvěma šestistěnnými kostkami:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
        }
    }
}
