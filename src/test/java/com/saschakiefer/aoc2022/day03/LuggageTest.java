package com.saschakiefer.aoc2022.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.saschakiefer.aoc2022.util.FileReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LuggageTest {

	@Test
	void getPrioritySum_testData_returnsCorrectSum() {
		// Arrange
		List<String> luggageData = List.of(
				"vJrwpWtwJgWrhcsFMMfFFhFp",
				"jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
				"PmmdzqPrVvPwwTWBwg",
				"wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
				"ttgJtRGJQctTZtZT",
				"CrZsJsPPZsGzwwsLwLmpwMDw");

		Luggage luggage = new Luggage(luggageData);

		// Act
		int prioritySum = luggage.getPrioritySum();

		// Assert
		assertEquals(157, prioritySum);

	}

	@Test
	void getPrioritySum_returnsCorrectSum() {
		List<String> input = FileReader.readFileToList("day03/input.txt");
		log.info("Priority Data: {}", new Luggage(input).getPrioritySum());
	}
}
