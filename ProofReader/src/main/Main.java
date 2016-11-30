package main;

import java.util.Scanner;

import corrector.CorrectorMachine;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNextLine()) {
			String line = CorrectorMachine.getCorrectedText(cin.nextLine());
			System.out.println(line);
		}
		
		cin.close();
	}
	
}
