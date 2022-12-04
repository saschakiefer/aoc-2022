package com.saschakiefer.aoc2022.day02;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Game {
	private final RoundConverter roundConverter;

	public int play(List<String> rounds){

		return rounds.stream().map(roundConverter::fromString).mapToInt(Round::getResultForPlayerTwo).sum();
	}
}
