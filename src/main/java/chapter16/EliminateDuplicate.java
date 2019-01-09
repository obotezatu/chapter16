package chapter16;

import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class EliminateDuplicate {

	public static void main(String[] args) {

		String text = "";
		Set<String> setOfNames = new HashSet<>();

		try (Scanner scanner = new Scanner(System.in)) {
			while (!text.equals("exit")) {
				System.out.println("Input name: ");
				text = scanner.nextLine();
				if (!text.equals("exit")) {
					setOfNames.add(text);
				}
			}
		}
		System.out.println("Without duplicate: ");
		for (String value : setOfNames) {
			System.out.printf("%s ", value);
		}
	}
}
