package com.javapractice.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStreamDemo {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		File f = new File("src/com/javapractice/FileHandling/testcopydata.txt");

		try {
			if (f.exists()) {
				// chaining of output stream in append mode
				bos = new BufferedOutputStream(new FileOutputStream(f, true));
			} else {
				bos = new BufferedOutputStream(new FileOutputStream(f));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// using autoclosable block
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("src/com/javapractice/FileHandling/testdata.txt"));
				BufferedOutputStream bos1 = bos) { // manage bos here

			int i;
			while ((i = bis.read()) != -1) {
				bos1.write(i); // write to bos1 (the managed stream)
			}

			// optional: add a newline after each append so runs are visible
			bos1.write(System.lineSeparator().getBytes());

			System.out.println("Data copied/appended successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
