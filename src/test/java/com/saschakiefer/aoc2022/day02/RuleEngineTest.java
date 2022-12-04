package com.saschakiefer.aoc2022.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RuleEngineTest {

	@Test
	void calculateScore() {
		assertEquals(8, new RuleEngine().calculateScore(Move.ROCK, Move.PAPER));
		assertEquals(1, new RuleEngine().calculateScore(Move.PAPER, Move.ROCK));
		assertEquals(6, new RuleEngine().calculateScore(Move.SCISSORS, Move.SCISSORS));
	}
}
