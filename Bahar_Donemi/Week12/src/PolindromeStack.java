import java.util.Scanner;
import java.util.Stack;

public class PolindromeStack {
	public static void main(String[] args) {
		System.out.println("bir parametre giriniz: ");
		Scanner scan = new Scanner(System.in);
		String write = scan.next();
		Stack<Character> stck1 = new Stack<>();
		int uzunluk = write.length();
		for (int i = 0; i < uzunluk; i++) {
			char a = write.charAt(i);
			stck1.push(a);
		}
		String reverse = "";
		for (int i = 0; i < uzunluk; i++) {
			reverse += stck1.pop();
		}
		if (write.equals(reverse)) {
			System.out.println("polindromdur");
		} else {
			System.out.println("polindrom deðildir");
		}
	}
}