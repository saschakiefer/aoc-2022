package com.saschakiefer.aoc2022.day01;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.saschakiefer.aoc2022.util.FileReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CaloriesCalculatorTest {

	@Test
	void getMaxCaloriesPerElf() {
		Optional<String> input = FileReader.readFileToString("day01/input.txt");
		log.info("Max calories carried by an elf: {}", new CaloriesCalculator().getMaxCaloriesPerElf(input.orElse("")));
	}
}
