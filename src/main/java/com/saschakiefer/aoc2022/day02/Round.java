package com.saschakiefer.aoc2022.day02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Round {
	private final Player playerOne;
	private final Player playerTwo;

	public int getResultForPlayerTwo() {
		return new RuleEngine().calculateScore(playerOne.getMove(), playerTwo.getMove());
	}

}
