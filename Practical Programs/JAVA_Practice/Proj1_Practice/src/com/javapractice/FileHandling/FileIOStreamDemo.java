package com.javapractice.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// Open file for reading and writing
			fis = new FileInputStream("src/com/javapractice/FileHandling/testdata.txt");
			fos = new FileOutputStream("src/com/javapractice/FileHandling/testdatacopy.txt");
			// read data from file
			int d = fis.read();
			while (d != -1) {
				// write data to file
				fos.write(d);
				d = fis.read();
			}
			System.out.println("file copied");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
