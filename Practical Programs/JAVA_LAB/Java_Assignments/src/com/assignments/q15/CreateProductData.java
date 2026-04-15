package com.assignments.q15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CreateProductData {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Pen", 10, 5.0));
		products.add(new Product(2, "Book", 3, 50.0));
		products.add(new Product(3, "Notebook", 5, 20.0));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"D:\\CDAC_IET\\PGCP-AC-CDAC-2026_LEARNINGS\\Practical Programs\\JAVA_LAB\\Java_Assignments\\productdata.dat"))) {
			oos.writeObject(products);
			System.out.println("Products written to productdata.dat");
		} catch (Exception e) {
			System.out.println("Error writing file: " + e);
		}
	}
}
