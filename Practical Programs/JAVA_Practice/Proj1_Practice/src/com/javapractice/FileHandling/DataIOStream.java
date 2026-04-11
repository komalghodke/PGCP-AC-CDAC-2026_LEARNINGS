package com.javapractice.FileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DataIOStream {
	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("src/com/javapractice/FileHandling/employee.txt"));) {
			String str = dis.readLine();
			double s = 0;
			Map<String, Double> summap = new HashMap<>();
			while (str != null) {
				System.out.println(str);
				String[] arr = str.split(",");
				Stream.of(arr).forEach(System.out::println);
				s = s + Double.parseDouble(arr[4]);
				// departmentwise sum
				String k = arr[3]; // retrieve department name
				if (summap.containsKey(k)) {
					// retrieve value if key exists
					double v = summap.get(k); // {Hr:5555}
					summap.put(k, v + Double.parseDouble(arr[4]));
				} else {
					// adding new key
					summap.put(k, Double.parseDouble(arr[4]));

				}
				System.out.println(summap);
				str = dis.readLine();
			} // end of while
				// display map
			for (String s1 : summap.keySet()) {
				System.out.println(s1 + "------>" + summap.get(s1));
			}
			System.out.println("sum of sal : " + s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
