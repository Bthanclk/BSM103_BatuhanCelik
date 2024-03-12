import java.util.ArrayList;
import java.util.Stack;

public class Polindromev2 {
	public static boolean validPalindrome(String str) {
		ArrayList<Character> lists1 = new ArrayList<Character>();
		Stack<Character> list = new Stack<Character>();
		Stack<Character> lists = new Stack<Character>();
		int uzunluk = str.length();
		for (int i = 0; i < uzunluk; i++) {
			list.add(str.charAt(i));
		}
		lists1.addAll(list);
		while (!list.isEmpty()) {
			char a = list.pop();
			lists.add(a);
		}
		if (lists1.equals(lists)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean screan = validPalindrome("abccba");
		System.out.println(screan);
	}
}