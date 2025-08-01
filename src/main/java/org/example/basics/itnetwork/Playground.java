package org.example.basics.itnetwork;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void basics() {
        patnact();
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

    public static void dvanact() {
//        int[] cisla = new int[10];
//
//        for (int i = 10; i > 0; i--) {
//            cisla[10 - i] = i;
//        }
//
//        for (int cislo : cisla) {
//            System.out.println(cislo);
//        }

//        Scanner scanner = new Scanner(System.in);
//        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
//        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};

//        String pokracovat = "ano";;
//        int pocetSlov = 0;
//
//        while (pokracovat.equalsIgnoreCase("ano")) {
//            System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
//            String zadaneSlovo = scanner.nextLine().toLowerCase();
//            String hlaska = "Tvoje slovo nemám v seznamu";
//
//            for (String z : zelenina) {
//                if (z.equals(zadaneSlovo)) {
//                    hlaska = "Zadal jsi zeleninu";
//                }
//            }
//
//            for (String o : ovoce) {
//                if (o.equals(zadaneSlovo)) {
//                    hlaska = "Zadal jsi ovoce";
//                }
//            }
//
//            pocetSlov++;
//
//            System.out.println(hlaska);
//            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
//            pokracovat = scanner.nextLine();
//            if (pokracovat.equalsIgnoreCase("ne")) {
//                pokracovat = "ne";
//                System.out.println("Zadal jsi " + pocetSlov + " slov");
//            }
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej počet čísel: ");
        int pocet = Integer.parseInt(scanner.nextLine());

        int[] cisla =  new int[pocet];

        for (int i = 0; i < pocet; i++) {
            System.out.println("Zadej " + (i+1) + ". číslo:");
            cisla[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] serazenePole = Arrays.copyOf(cisla, pocet);
        Arrays.sort(serazenePole);

        for (int cislo : cisla) {
            System.out.println(cislo + " se od mediánu odchyluje o " + (cislo - serazenePole[cisla.length/2]));
        }
    }

    public static void ctrnact(){
//        System.out.println("ASCII tabulka");
//        System.out.println("=============");
//        for (int hodnotaAscii = 33; hodnotaAscii < 256; hodnotaAscii++) {
//            System.out.println(hodnotaAscii + ":" + (char)hodnotaAscii);
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Zadej palindrom: ");
//        String slovo = scanner.nextLine();
//
//        String slovoPozpatku = "";
//
//        for (int i = 0; i < slovo.length(); i++) {
//            slovoPozpatku += slovo.charAt(slovo.length() - i - 1);
//        }
//
//        if (slovo.equals(slovoPozpatku)) {
//            System.out.println("Ano, toto je palindrom.");
//        }  else {
//            System.out.println("Toto není palindrom.");
//        }


//todo: procvičovat
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte text k zašifrování: ");
        String puvodniZprava = scanner.nextLine();

        System.out.println("Zadejte heslo: ");
        String heslo = scanner.nextLine();

        int pocitadlo = 0;
        while (puvodniZprava.length() > heslo.length()) {
            heslo += heslo.charAt(pocitadlo);
            pocitadlo++;
            if (pocitadlo == heslo.length()) {
                pocitadlo = 0;
            }
        }

        String zasifrovanaZprava = "";

        for (int i = 0; i < puvodniZprava.length(); i++) {
            int puvodniZpravaAscii = (int)puvodniZprava.charAt(i);
            int hesloAscii = (int)heslo.charAt(i) - 96;
            char pismeno;
            if (puvodniZpravaAscii + hesloAscii > 122) {
                pismeno = (char)((puvodniZpravaAscii + hesloAscii) - 26);
            } else {
                pismeno = (char)(puvodniZpravaAscii + hesloAscii);
            }

            zasifrovanaZprava += pismeno;
        }
        System.out.println(zasifrovanaZprava);

//        String puvodniZprava = "moribundus";
//        String heslo = "ahoj";
//
//        String zasifrovanaZprava = "";
//
//        int[] hesloCisla = new int[heslo.length()];
//        int[] puvodniZpravaCisla = new int[puvodniZprava.length()];
//        int[] zasifrovanaZpravaCisla = new int[puvodniZprava.length()];
//
//        char[] zasifrovano =  new char[puvodniZprava.length()];
//
//        for (int i = 0; i < heslo.length(); i++) {
//            hesloCisla[i] = heslo.charAt(i) - 96;
//        }
//
//        for (int i = 0; i < puvodniZprava.length(); i++) {
//            puvodniZpravaCisla[i] = puvodniZprava.charAt(i) - 96;
//        }
//
//        int j = 0;
//        int hesloCisloOKolikSeMaPosunout = 0;
//        for (int i = 0; i < puvodniZprava.length(); i++) {
//                if (j < 4) {
//                    if (heslo.charAt(j) > 122) {
//                        System.out.println("nad 122");
//                    System.out.println(heslo.charAt(j) - 26);
//                        hesloCisloOKolikSeMaPosunout = 122 - heslo.charAt(j) + 1;
//                        j++;
//
//                    } else {
//                        System.out.print(heslo.charAt(j) + ", ");
//                System.out.print((int)heslo.charAt(j) + ", ");
////                        System.out.print((heslo.charAt(j) - 96));
//                        System.out.println();
////                        System.out.println(122 - 96);
//
//                        hesloCisloOKolikSeMaPosunout = (heslo.charAt(j) - 96);
//                        j++;
//                    }
//                } else {
//                    j = 0;
//                    hesloCisloOKolikSeMaPosunout = (heslo.charAt(j) - 96);
//                    j++;
//                }
//                zasifrovanaZpravaCisla[i] = hesloCisloOKolikSeMaPosunout + (puvodniZprava.charAt(i) - 96);
////            } else {
////                System.out.println("nad 122");
////            }
//        }
//
//        int k = 0;
//        for (int i = 0; i < puvodniZprava.length(); i++) {
////            todo: pokud se dostane písmeno na určitou hodnotu, tak odečíst počet znaků
////            if (k < 4) {
//                zasifrovano[i] = (char)(zasifrovanaZpravaCisla[i] + 96);
////                k++;
////            }
//
//        }
//
//        System.out.println();
////        System.out.println(Arrays.toString(hesloCisla));
////        System.out.println(Arrays.toString(puvodniZpravaCisla));
////        System.out.println(Arrays.toString(zasifrovanaZpravaCisla));
//        System.out.println(Arrays.toString(zasifrovano));
//
//        System.out.println(zasifrovanaZprava);
    }

    public static void patnact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Výpočet průměru známek");
//        System.out.println("Zadejte známky oddělené čárkou: ");
//        String vstup = scanner.nextLine();
//
//        String[] vstupArr = vstup.split(",");
//
//        double soucet = 0;
//        for (int i = 0; i < vstupArr.length; i++) {
//            soucet += Integer.parseInt(vstupArr[i]);
//        }
//        System.out.println("Průměr: " + soucet/vstupArr.length);


//        String abeceda = "abcdefghijklmnopqrstuvwxyz";
//        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
//                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
//                "...-", ".--", "-..-", "-.--", "--.."};
//
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Zadejte zprávu k zakódování: ");
////        String puvodniZprava = scanner.nextLine().toLowerCase();
//        String puvodniZprava = "Tento program jsem vytvoril sam, podivejte, co dovede.";
//        String zasifrovanaZprava = "";
//
//        String[] puvodniZpravaMalymaPismenama = puvodniZprava.toLowerCase().split("");
//
//        for (String znak : puvodniZpravaMalymaPismenama) {
//			String morseuvZnak = "";
//            int index = -1;
//
//            for (int i = 0; i < abeceda.length(); i++) {
//                if (abeceda.contains(znak)) {
//					index = abeceda.indexOf(znak);
//                }
//            }
//
//            if (index >= 0) {
//                morseuvZnak = morseovyZnaky[index] + " ";
//            }
//
//            zasifrovanaZprava += morseuvZnak;
//		}
//
//		System.out.println("Zakódovaná zpráva: " + zasifrovanaZprava);


//todo: procvičovat
//		Scanner scanner = new Scanner(System.in);
////		System.out.println("Zadej text k rozveselení: ");
////		String text = scanner.nextLine();
//
//		String text = "Dnes jsem zaspal. Také jsem naboural auto! A spolkl mouchu!! Nemám já den blbec?";
//        String[] smile = {":)", ":D", ":P"};
//        String[] interpunkce = {".", "!", "?"};
//
//		for (int i = 0; i < text.length(); i++) {
//			for (int j = 0; j < smile.length; j++) {
////				if (text.contains(interpunkce[j])) {
////					text = text.replace(interpunkce[j], " " + smile[j]);
//					text = text.replace(".", " " + smile[j]);
//					text = text.replace("!", "! " + smile[j]);
//					text = text.replace(":D!", " ");
//					text = text.replace("?", " " + smile[j]);
//				}

//				switch (interpunkce[j]) {
//					case ".": text = text.replace(".", " " + smile[j]);
//					break;
//					case "!": text = text.replace("!", "! " + smile[j]);
//					break;
//					case "?": text = text.replace("?", "? " + smile[j]);
//					break;
//
//
//
//				}

//				if (text.contains("!")) {
//					text = text.replace("!", "! " + smile[j]);
//				}
//			}
//		}


//
//		if (text.contains(":D!")) {
//			text = text.replace(" :D!", "");
//		}
//
//		if (text.contains("?")) {
//			text = text.replace("?", "? :D");
//		}
//
//		if (text.contains(":D?")) {
//			text = text.replace(" :D?", "");
//		}

//		System.out.println(text);


		Scanner scanner = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej text k rozveselení: ");
		String text = scanner.nextLine();

		String[] smiles = {" :)", " :D", " :P"};

		int count = 3;
		String replaced = "";

		for (String split: text.split("")) {
			if (split.equals(".")) {
				split = smiles[count % 3];
				count++;
			}
			if (split.equals("!") || split.equals("?")) {
				split += smiles[count % 3];
				count++;
			}
			replaced += split;
		}
		System.out.println("Rozveselený text: " + replaced);
    }
}
