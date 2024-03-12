import java.util.Scanner;
public class Batuhan_Celik_Uygulama5 {

	public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);
	System.out.println("Bir kelime giriniz : ");
String inputStr = input.nextLine();
		
	System.out.println("Bir sayi giriniz : ");
int inputInt = input.nextInt();
		
splitter(inputStr , inputInt);
		

	}
public static void splitter(String  str , int n) {
int index = 0;
for ( int i = 0; i < str.length()/n ; i++) {
	
	System.out.println(str.substring(index,index+n));
index = index + n ;
			
			
		}
	System.out.println(str.substring(index, str.length()));		

	}

}
