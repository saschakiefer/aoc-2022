package com.saschakiefer.aoc2022.day03;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Luggage {
	private final List<String> luggage;

	public int getPrioritySum() {
		return luggage.stream().mapToInt(l -> new Rucksack(l).getDuplicateValue()).sum();
	}
}
