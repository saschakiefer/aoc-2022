package com.saschakiefer.aoc2022.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class RucksackTest {
	@Test
	public void constructor_createsCorrectCompartmentContent() {
		// Arrange
		Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

		// Act & Assert
		assertEquals("vJrwpWtwJgWr", rucksack.getCompartmentA());
		assertEquals("hcsFMMfFFhFp", rucksack.getCompartmentB());

	}

	@Test
	public void findDuplicate_returnsDuplicate() {
		// Arrange
		Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

		// Act
		Optional<Character> duplicate = rucksack.findDuplicate();

		// Assert
		assertTrue(duplicate.isPresent());
		assertEquals('p', rucksack.findDuplicate().get());

	}

	@Test
	public void getDuplicateValue() {
		Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		assertEquals(16, rucksack.getDuplicateValue());

		rucksack = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
		assertEquals(38, rucksack.getDuplicateValue());

		rucksack = new Rucksack("PmmdzqPrVvPwwTWBwg");
		assertEquals(42, rucksack.getDuplicateValue());

		rucksack = new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
		assertEquals(22, rucksack.getDuplicateValue());

		rucksack = new Rucksack("ttgJtRGJQctTZtZT");
		assertEquals(20, rucksack.getDuplicateValue());

		rucksack = new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw");
		assertEquals(19, rucksack.getDuplicateValue());

	}
}
