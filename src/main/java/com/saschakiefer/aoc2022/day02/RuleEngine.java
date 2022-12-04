package com.saschakiefer.aoc2022.day02;

public class RuleEngine {

	public int calculateScore(Move opponent, Move player) {
		return getMoveValue(opponent, player) + getSelectionValue(player);
	}

	private int getMoveValue(Move opponent, Move player) {
		if (opponent == player) return 3;
		else if (opponent == Move.ROCK && player == Move.SCISSORS ) return 0;
		else if (opponent == Move.SCISSORS && player == Move.PAPER) return 0;
		else if (opponent == Move.PAPER && player == Move.ROCK) return 0;
		else return 6;
	}

	private int getSelectionValue(Move move) {
		return switch (move) {
			case ROCK -> 1;
			case PAPER -> 2;
			case SCISSORS -> 3;
			default -> 0;
		};
	}
}
