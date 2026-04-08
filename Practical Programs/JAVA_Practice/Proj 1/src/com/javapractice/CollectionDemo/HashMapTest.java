package com.javapractice.CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DTISS", 58);
		hm.put("DBDA", 60);
		System.out.println(hm);

		if (!hm.containsKey("DAC")) {
			hm.put("DAC", 400);
			System.out.println("data added");
		} else {
			System.out.println("key exists");
		}
		hm.put("DHPCSA", 40);
		System.out.println(hm);
		System.out.println(hm.get("DAC"));

		for (String s : hm.keySet()) {
			if (hm.get(s) < 100) {
				System.out.println(s + "---->" + hm.get(s));
			}
		}

		Set<Map.Entry<String, Integer>> eset = hm.entrySet();
		for (Map.Entry<String, Integer> s : eset) {
			if (s.getValue() < 100) {
				System.out.println(s.getKey() + "---->" + s.getValue());
			}
		}

	}
}
