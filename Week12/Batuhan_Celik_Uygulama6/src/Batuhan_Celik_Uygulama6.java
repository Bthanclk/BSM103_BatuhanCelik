import java.util.Arrays;
public class Batuhan_Celik_Uygulama6 {

	public static void main(String[] args) {
		
int x = 0;
int [] arr  = new 	int[6];
	x = x+1;
mystery(x, arr);

	System.out.println(x+	" " + Arrays.toString(arr));
    x=x+1;
    
mystery(x,arr);
	System.out.println(x+ " " +Arrays.toString(arr));
		}
	
public static void mystery(int x,int[] arr ) {
	x = x+1;
	
arr[x] = arr[x] + 1;
	System.out.println(x + "  " +Arrays.toString(arr));
	}

}
