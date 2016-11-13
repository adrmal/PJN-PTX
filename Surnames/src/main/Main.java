package main;

import java.util.Scanner;

import surname.SurnamesMachine;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNextLine()) {
			SurnamesMachine.printSurnameInAllCases(cin.nextLine());
		}
		
		cin.close();
	}
	
}
