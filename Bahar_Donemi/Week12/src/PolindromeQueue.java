import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PolindromeQueue {
	public static void main(String[] args) {
		System.out.println("String deðerini giriniz: ");
		Scanner scan = new Scanner(System.in);
		String write = scan.next();
		Queue<Character> que = new LinkedList<>();
		for (int i = write.length() - 1; i >= 0; i--) {
			char a = write.charAt(i);
			que.add(a);
		}
		String reverse = "";
		int uzunluk = que.size();
		for (int i = 0; i < uzunluk; i++) {
			reverse += que.remove();
		}
		if (write.equals(reverse)) {
			System.out.println("polindromdur");
		} else {
			System.out.println("polindrom deðildir");
		}
	}
}