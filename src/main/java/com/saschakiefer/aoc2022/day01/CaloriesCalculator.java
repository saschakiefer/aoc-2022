package com.saschakiefer.aoc2022.day01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;

@Log4j
public class CaloriesCalculator {
	public int getMaxCaloriesPerElf(String statistics) {
		Stream<IntStream> caloriesPerElf = Arrays.stream(statistics.split("\n\n")).map(s -> Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt));
		Stream<Integer> caloriesPerElfAccumulated = caloriesPerElf.map(IntStream::sum);

		return caloriesPerElfAccumulated.max(Integer::compare).orElse(0);
	}
}
