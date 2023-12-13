package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromKB {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		while (true) {
			String line = br.readLine();
			
			if (line.equalsIgnoreCase("exit"))
				break;
			System.out.print(line);
		}

	}

}
