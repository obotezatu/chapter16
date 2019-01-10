//16.16
package chapter16;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class DuplicateWordCount {

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();

		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<String, Integer> map) {
		String text;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a phrase: ");
			text = scanner.nextLine();
		}
		String[] tokens = text.split(" ");

		for (String token : tokens) {
			String letter = token.toLowerCase();

			if (map.containsKey(letter)) {
				int count = map.get(letter);
				map.put(letter, count + 1);
			} else
				map.put(letter, 1);
		}
	}

	private static void displayMap(Map<String, Integer> map) {

		Set<String> keys = map.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.printf("%nMap contains:%nKey\tValue%n");

		for (String key : sortedKeys) {
			if (map.get(key) > 1) {
				System.out.printf("%-10s%3s%n", key, map.get(key));
			}
		}

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}
}
