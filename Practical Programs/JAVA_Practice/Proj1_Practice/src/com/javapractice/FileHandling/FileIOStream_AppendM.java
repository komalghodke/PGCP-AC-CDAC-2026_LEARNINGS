package com.javapractice.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream_AppendM {

	public static void main(String[] args) {
		File f = new File("src/com/javapractice/FileHandling/testcopyfile.txt");
		FileOutputStream fos = null;

		try {
			if (f.exists()) {
				// open it in append mode
				fos = new FileOutputStream(f, true);
			} else {
				// open file in write mode
				fos = new FileOutputStream(f);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("src/com/javapractice/FileHandling/testdata.txt");
				FileOutputStream fos1 = fos) {

			// optional: add a newline before appending
			fos1.write(System.lineSeparator().getBytes());

			int i;
			while ((i = fis.read()) != -1) {
				fos1.write(i);
			}

			// optional: add a newline after appending
			fos1.write(System.lineSeparator().getBytes());

			System.out.println("Data copied/appended successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}