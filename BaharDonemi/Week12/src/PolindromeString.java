import java.util.Scanner;

public class PolindromeString {
	public static void main(String[] args) {
		System.out.println("bir deðer giriniz: ");
		Scanner scan = new Scanner(System.in);
		String write = scan.next();
		int uzunluk = write.length();
		String reverse = "";
		for (int i = write.length() - 1; i >= 0; i--) {
			reverse += write.charAt(i);
		}
		if (write.equals(reverse)) {
			System.out.println("polindromdur");
		} else {
			System.out.println("polindrom deðildir");
		}
	}
}