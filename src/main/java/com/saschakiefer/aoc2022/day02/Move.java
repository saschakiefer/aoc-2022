package com.saschakiefer.aoc2022.day02;

import lombok.Getter;

@Getter
enum Move {
	ROCK,
	PAPER,
	SCISSORS;

	public static Move getByCode(String value) {
		return switch (value) {
			case "A", "X" -> Move.ROCK;
			case "B", "Y" -> Move.PAPER;
			case "C", "Z" -> Move.SCISSORS;
			default -> null;
		};
	}
}
