package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo2 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("demofile.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);

				FileOutputStream fos = new FileOutputStream("demofile_2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

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
