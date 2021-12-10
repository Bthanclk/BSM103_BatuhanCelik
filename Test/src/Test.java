//Algoritma Vize Sýnavý 1. soru çözümü (kendim yaptým)
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
	
System.out.print("Lütfen Bir Sayý Giriniz");		
		
   int a = input.nextInt();		
   int sayac = 1;
   
while (sayac<=30) {   

   if (a%2==0) {
System.out.println(a + " Çift bir sayýdýr.");   
   } 
   else	
System.out.println(a + " Tek bir sayýdýr.");	   
	   
 sayac++;
 a = input.nextInt();
   
  	
		
}		
System.out.println("Artýk bitti programý yeniden baþlatýnýz.");	
   	
		

		

	}

	
	}


