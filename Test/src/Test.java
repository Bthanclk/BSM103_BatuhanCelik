//Algoritma Vize S�nav� 1. soru ��z�m� (kendim yapt�m)
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
	
System.out.print("L�tfen Bir Say� Giriniz");		
		
   int a = input.nextInt();		
   int sayac = 1;
   
while (sayac<=30) {   

   if (a%2==0) {
System.out.println(a + " �ift bir say�d�r.");   
   } 
   else	
System.out.println(a + " Tek bir say�d�r.");	   
	   
 sayac++;
 a = input.nextInt();
   
  	
		
}		
System.out.println("Art�k bitti program� yeniden ba�lat�n�z.");	
   	
		

		

	}

	
	}


