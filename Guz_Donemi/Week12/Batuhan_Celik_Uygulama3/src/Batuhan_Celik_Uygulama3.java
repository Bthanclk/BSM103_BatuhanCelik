import java.util.Scanner;
public class Batuhan_Celik_Uygulama3 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
	System.out.println("Eleman Sayisini giriniz :  ");
int elemansayisi = input.nextInt();
		
int dizi[] = new int[elemansayisi];
		
for (int index = 0; index < dizi.length; index++) {
	System.out.println("dizinin  "+index+" indeksli elemaný  giriniz :  ");
dizi[index] = input.nextInt();
			}
double ortalama = ortalama(dizi);
	System.out.println(ortalama);
		}
	
public static double ortalama ( int [] dizi) {
double avg = 0.0;
int total = 0;
	for( int index = 0; index < dizi.length; index++) {
		total += dizi[index];
		
		}
avg = (double) total / dizi.length;
	return avg;
		
	}

}
