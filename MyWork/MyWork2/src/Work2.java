import java.util.Arrays;
import java.util.Scanner;

public class Work2 {
//Dizideki elemanlar� k���kten b�y��e s�ralama
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int gecici;
		int[] dizi = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Dizinin " + (i + 1) + " . eleman�n� giriniz: ");
			dizi[i] = input.nextInt();
		}

		System.out.println("Dizinin normal hali : " + Arrays.toString(dizi));

		for (int i = 0; i < 9; i++) {

			for (int j = i + 1; j < 10; j++) {

				if (dizi[j] < dizi[i]) {

					gecici = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = gecici;

				}

			}

		}
		System.out.println("Dizinin k���kten b�y��e do�ru s�ralanm�� hali : " + Arrays.toString(dizi));

	}

}
