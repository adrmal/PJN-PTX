package main;

import java.util.Scanner;

import corrector.CorrectorMachine;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		CorrectorMachine.initializeListOfAllWords();
		
		while(cin.hasNextLine()) {
			String line = CorrectorMachine.getCorrectedText2(cin.nextLine());
			System.out.println(line);
		}
		
		cin.close();
	}
	
}
