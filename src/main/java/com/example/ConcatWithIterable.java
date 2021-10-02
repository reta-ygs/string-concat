package com.example;

import java.util.ArrayList;

public class ConcatWithIterable {

	static String concat(String s, int count) {
		ArrayList<String> result = new ArrayList<>();
		result.add(s);
		for (int i = 0; i < count; i++) {
			result.add(s);
		}
		return String.join("", result);
	}
}
