package com.saschakiefer.aoc2022.day02;

public class RoundConverterPart2 implements RoundConverter {
	@Override
	public Round fromString(String rawRound) {
		String[] moves = rawRound.split(" ");

		Move opponentMove = Move.getByCode(moves[0].toUpperCase());

		return new Round(
				new Player(opponentMove),
				new Player(convertExpectedResultToMove(opponentMove, moves[1].toUpperCase()))
		);
	}

	private Move convertExpectedResultToMove(Move opponentMove, String expectedResult) {
		return switch (expectedResult) {
			case "X" -> // Loose
					switch (opponentMove) {
						case ROCK -> Move.SCISSORS;
						case PAPER -> Move.ROCK;
						case SCISSORS -> Move.PAPER;
					};
			case "Y" -> opponentMove;
			case "Z" -> // Win
					switch (opponentMove) {
						case ROCK -> Move.PAPER;
						case PAPER -> Move.SCISSORS;
						case SCISSORS -> Move.ROCK;
					};
			default -> throw new IllegalStateException("Unexpected value: " + expectedResult);
		};
	}
}
