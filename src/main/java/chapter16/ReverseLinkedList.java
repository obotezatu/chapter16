//16.18
package chapter16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		char inputCharacter;
		LinkedList<Character> listChars = new LinkedList<>();
		LinkedList<Character> copyOfListChars = new LinkedList<>();

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter 10 chars: ");
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d -> ",i );
				inputCharacter = scanner.next().charAt(0);
				listChars.add(inputCharacter);
			}
			copyOfListChars = (LinkedList<Character>) listChars.clone();
			Collections.reverse(copyOfListChars);
			System.out.println("Initial list: " + listChars);
			System.out.println("Reversed list : " + copyOfListChars);
		}
	}
}
