package com.saschakiefer.aoc2022.day02;

public class RoundConverterPart1 implements RoundConverter {
	@Override
	public Round fromString(String rawRound) {
		String[] moves = rawRound.split(" ");

		return new Round(
				new Player(Move.getByCode(moves[0].toUpperCase())),
				new Player(Move.getByCode(moves[1].toUpperCase()))
		);
	}
}
