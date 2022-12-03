package com.saschakiefer.aoc2022.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;

public class FileReader {
	public static Optional<String> readFileToString(String name) {

		String content;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(name);
			content = IOUtils.toString(is, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			return Optional.empty();
		}

		return Optional.of(content);
	}

	public static List<String> readFileToList(String name) {

		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(name);
			return IOUtils.readLines(is, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
