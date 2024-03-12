import java.util.Scanner;

public class PolindromeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("String bir parametre giriniz: ");
		String write1 = scan.next();
		System.out.println(isPolindrome(write1));
	}

	public static boolean isPolindrome(String text) {
		if (text.length() % 2 == 1) {
			System.out.println(text);
			int uzunlugu = (text.length() - 1) / 2;
			String reverse = "";
			String reverse3 = "";
			for (int i = 0; i < uzunlugu; i++) {
				reverse3 += text.charAt(i);
			}
			System.out.println(reverse3);
			for (int i = uzunlugu + 1; i < text.length(); i++) {
				reverse += text.charAt(i);
			}
			System.out.println(reverse);
			String reverse2 = "";
			int uzunluk = reverse.length();
			for (int i = reverse.length() - 1; i >= 0; i--) {
				reverse2 += reverse.charAt(i);
			}
			System.out.println(reverse2);
			if (reverse3.equals(reverse2)) {
				return true;
			} else {
				return false;
			}
		}
		if (text.length() % 2 == 0) {
			int uzunluðu = (text.length() - 1) / 2;
			System.out.println(text);
			String reverse = "";
			String reverse3 = "";
			for (int i = 0; i <= uzunluðu; i++) {
				reverse3 += text.charAt(i);
			}
			System.out.println(reverse3);
			for (int i = uzunluðu + 1; i < text.length(); i++) {
				reverse += text.charAt(i);
			}
			System.out.println(reverse);
			String reverse2 = "";
			int uzunluk = reverse.length();
			for (int i = reverse.length() - 1; i >= 0; i--) {
				reverse2 += reverse.charAt(i);
			}
			System.out.println(reverse2);
			if (reverse3.equals(reverse2)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}