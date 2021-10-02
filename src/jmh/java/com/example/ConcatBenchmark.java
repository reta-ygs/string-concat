package com.example;

import org.openjdk.jmh.annotations.Benchmark;

public class ConcatBenchmark {
	@Benchmark
	public void stringOnce() {
		ConcatWithOperator.concat("a", 0);
	}

	@Benchmark
	public void stringBuilderOnce() {
		ConcatWithStringBuilder.concat("a", 0);
	}

	@Benchmark
	public void concatWithOperator() {
		ConcatWithOperator.concat("a", 5);
	}

	@Benchmark
	public void concatWithStringBuilder() {
		ConcatWithStringBuilder.concat("a", 5);
	}

	@Benchmark
	public void concatWithIterable() {
		ConcatWithIterable.concat("a", 5);
	}

	@Benchmark
	public void concatWithLiteral() {
		String s =
				"a"
				+ "a"
				+ "a"
				+ "a"
				+ "a"
				;
	}
}
