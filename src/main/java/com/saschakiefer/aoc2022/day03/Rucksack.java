package com.saschakiefer.aoc2022.day03;

import java.util.HashSet;
import java.util.Optional;

import lombok.Getter;

@Getter
public class Rucksack {
	private final String content;
	private final String compartmentA;
	private final String compartmentB;

	public Rucksack(String content) {
		this.content = content;
		compartmentA = content.substring(0, content.length() / 2);
		compartmentB = content.substring(content.length() / 2);
	}

	public Optional<Character> findDuplicate() {
		HashSet<Character> compartmentASet = getCharacters(compartmentA);
		HashSet<Character> compartmentBSet = getCharacters(compartmentB);

		if (compartmentASet.retainAll(compartmentBSet)) {
			return Optional.of((Character) compartmentASet.toArray()[0]);
		} else {
			return Optional.empty();
		}
	}

	public int getDuplicateValue() {
		Optional<Character> duplicate = findDuplicate();
		if (duplicate.isEmpty()) return 0;

		int value = duplicate.get();

		if (value > 96) {
			return value - 96;
		} else {
			return value - 64 + 26;
		}
	}

	private HashSet<Character> getCharacters(String content) {
		HashSet<Character> contentSet = new HashSet<>();

		for (int i = 0; i < content.length(); i++) {
			contentSet.add(content.charAt(i));
		}

		return contentSet;
	}
}
