import java.util.Scanner;

public class Work1 {
// Dizideki tek say�lar� baska diziye aktar�p ekrana tek say�lar� yazd�rma
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sayac = 0;
		int[] dizi1 = new int[10];
		int[] dizi_tek = new int[10];

		for (int eleman = 0; eleman < 10; eleman++) {

			System.out.print("Dizinin " + (eleman + 1) + ". eleman�n� giriniz: ");
			dizi1[eleman] = input.nextInt();

			if (dizi1[eleman] % 2 == 1) {

				dizi_tek[sayac] = dizi1[eleman];
				sayac++;
			}

		}
		System.out.println("Tek say�lar: ");
		for (int eleman = 0; eleman < sayac; eleman++) {
			System.out.print(dizi_tek[eleman]);
			System.out.print(" , ");
		}
		System.out.println(" ");
		System.out.print(sayac + " Tane tek say� vard�r.");
	}

}