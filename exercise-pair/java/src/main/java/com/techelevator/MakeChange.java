package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the total bill");
		String strTotalBill = scanner.nextLine();
		double totatBill = Double.parseDouble(strTotalBill);

		System.out.println("Please enter the amount tendered");
		String strAmountTendered = scanner.nextLine();
		double amountTendered = Double.parseDouble(strAmountTendered);

		double change = amountTendered - totatBill;

		System.out.println("The change required is $" + change);







	}

}
