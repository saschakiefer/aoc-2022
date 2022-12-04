package com.saschakiefer.aoc2022.day02;

import java.util.List;

public class Game {
	public int play(List<String> rounds){

		return rounds.stream().map(RoundConverter::fromString).mapToInt(Round::getResultForPlayerTwo).sum();
	}
}
