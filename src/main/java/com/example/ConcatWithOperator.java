package com.example;

public class ConcatWithOperator {

	static String concat(String s, int count) {
		String result = s;
		for (int i = 0; i < count; i++) {
			result += s;
		}
		return result;
	}
}
