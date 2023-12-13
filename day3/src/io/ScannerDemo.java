package io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line=sc.nextLine();
			if(line.equalsIgnoreCase("exit")) break;
			System.out.println(line);
		}

	}

}
