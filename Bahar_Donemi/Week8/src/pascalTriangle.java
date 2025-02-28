import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    list.get(i).add(1);
                } else {
                    int med = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(med);
                }
            }
        }
        return list;
    }
}