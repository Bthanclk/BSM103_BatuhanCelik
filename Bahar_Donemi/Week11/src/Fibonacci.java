import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacciSeries(6));
	}

	public static ArrayList<Integer> fibonacciSeries(int numOfRows) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		for (int i = 2; i < numOfRows; i++) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		return list;
	}
}