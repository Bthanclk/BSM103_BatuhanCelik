import java.io.*;
import java.util.*;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		countWords();

	}

	public static void countWords() throws FileNotFoundException {
		Scanner input = new Scanner(new File("test.txt"));
		Set<String> words = new HashSet<String>();

		while (input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);
		}
		System.out.println("kelimeler: " + words);
		System.out.println("kelime sayýsý: " + words.size());

		for (String word : words)
			System.out.println(word);
	}
}
