import java.util.Scanner;

public class Batuhan_Celik_Uygulama1 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
System.out.println("Ogrenci Sayisini Giriniz : ");
int ogrenciSayisi = input.nextInt();

System.out.println(ogrenciSayisi + "  tane öðrencinin notu giriliecek ...");

for(int i= 1; i<=ogrenciSayisi; i++ ) {
	System.out.println(i + ". öðrencinin vize notunu giriniz :  ");
	int vizeNotu = input.nextInt();
	
	System.out.println(i + ".  öðrencinin final notunu giriniz :  ");
	int finalNotu = input.nextInt();	
	
	System.out.println("öðrencinin  vize notu :  "+vizeNotuHesaplama(vizeNotu));
	System.out.println("öðrencinin final notu :  "+ finalNotuHesaplama(finalNotu)); 
	
}

}

public static double vizeNotuHesaplama(int vizeNotu) {
double not =0.0;
if(vizeNotu >= 80) {
	not = vizeNotu * 1.10;
}
else if (vizeNotu >= 60 ) {
	not = vizeNotu * 1.05;		
}
else if (vizeNotu <= 59) {
	not = vizeNotu * 1;
}
if (not > 100)
	not = 100;
return not;
}
public static double finalNotuHesaplama(int finalNotu) {
double not =0.0;
if ( finalNotu >= 70) {
	not = finalNotu * 1.10;
}
else if (finalNotu >= 40) {
	not = finalNotu * 1.05;
}
else if (finalNotu <= 39) {
	not = finalNotu * 1;
}
if (not >100)
	not = 100;
return not;
	
		
	}

}
