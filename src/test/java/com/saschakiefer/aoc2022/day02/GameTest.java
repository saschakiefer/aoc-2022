package com.saschakiefer.aoc2022.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.saschakiefer.aoc2022.day01.CaloriesCalculator;
import com.saschakiefer.aoc2022.util.FileReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GameTest {

	@Test
	void play_withDemoDataReturnsCorrectResult() {

		// Arrange
		List<String> input = List.of("A Y", "B X", "C Z");
		Game game = new Game();

		// Act
		int result = game.play(input);

		// Assert
		assertEquals(15, result);
	}

	@Test
	void play_withInputFile_returnsYourScore() {
		List<String> input = FileReader.readFileToList("day02/input.txt");
		log.info("Your Score: {}", new Game().play(input));
	}
}
