import java.util.Scanner;
public class Batuhan_Celik_Uygulama4 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
	System.out.println("Bir kelime giriniz : ");
String kelime = input.nextLine();
		
	System.out.println("Girilen kelime =  "+kelime);
	System.out.println("Kelimenin tersten yazilmis  hali =  " + tersten(kelime));
		}
public static String tersten(String kelime ) {
String ters = "";
for ( int index = kelime.length(); index > 0 ; index--) {
			
ters += kelime.substring(index - 1 , index);
		}
return ters;
		

	}

}
