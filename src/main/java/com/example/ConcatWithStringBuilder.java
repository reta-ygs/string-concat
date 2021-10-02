package com.example;

public class ConcatWithStringBuilder {

	static String concat(String s, int count) {
		StringBuilder result = new StringBuilder(s);
		for (int i = 0; i < count; i++) {
			result.append(s);
		}
		return result.toString();
	}
}
