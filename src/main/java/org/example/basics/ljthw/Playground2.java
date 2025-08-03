package org.example.basics.ljthw;

import java.util.Scanner;

public class Playground2 {
	public static void basics() {
		String[] args = {"to", "ko"};

		third(args);
	}

	public static void first(String[] args) {
		System.out.println("I am determined to learn how to code.");
		System.out.println("Today's date is");
	}

	public static void third(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out/* hjdjdjdkdls */.println("I am determined to learn how to code.");
//		String date = scanner.nextLine();
//		System.out.println("Today's date is " + date);

//		int age = 22;
//		boolean onGuestList = false;
//		double allure = 7.5;
//		String gender = "F";
//
//		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
//			System.out.println("You are allowed to enter the club.");
//			} else {
//				System.out.println("You are not allowed to enter the club.");
//			}
		int n;
		String message = "zprava";

		for ( n = 5 ; n <= 50 ; n += 5 ) {
			System.out.println( n + ". " + message );
		}
		System.out.println( "\nFinally, three times counting backward." );

		for ( ; n > 0 ; n -= 1 ) {
			System.out.println( n + ". " + message );
		}

		int num;
		for (  num : orderNumbers ) {
			System.out.println( num + " found.");
		}
	}
}
//fjfjf
