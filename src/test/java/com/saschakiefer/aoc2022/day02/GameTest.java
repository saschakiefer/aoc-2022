package com.saschakiefer.aoc2022.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.saschakiefer.aoc2022.util.FileReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GameTest {

	@Test
	void play_withDemoDataPart1_ReturnsCorrectResult() {

		// Arrange
		List<String> input = List.of("A Y", "B X", "C Z");
		Game game = new Game(new RoundConverterPart1());

		// Act
		int result = game.play(input);

		// Assert
		assertEquals(15, result);
	}

	@Test
	void play_withDemoDataPart2_ReturnsCorrectResult() {

		// Arrange
		List<String> input = List.of("A Y", "B X", "C Z");
		Game game = new Game(new RoundConverterPart2());

		// Act
		int result = game.play(input);

		// Assert
		assertEquals(12, result);
	}

	@Test
	void play_withInputFilePart1_returnsYourScore() {
		List<String> input = FileReader.readFileToList("day02/input.txt");
		log.info("Your Score: {}", new Game(new RoundConverterPart1()).play(input));
	}

	@Test
	void play_withInputFilePart2_returnsYourScore() {
		List<String> input = FileReader.readFileToList("day02/input.txt");
		log.info("Your Score: {}", new Game(new RoundConverterPart2()).play(input));
	}
}
