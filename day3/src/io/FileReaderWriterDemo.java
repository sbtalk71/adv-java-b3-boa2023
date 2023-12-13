package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {

		try (FileReader fis = new FileReader("demofile.txt");
				BufferedReader bis = new BufferedReader(fis);

				FileWriter fos = new FileWriter("demofile_3.txt");
				BufferedWriter bos = new BufferedWriter(fos);) {

			int b = 0;

			while ((b = bis.read()) != -1) {
				System.out.print((char) b);
				bos.write(b);

			}
			bos.flush();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
