import java.io.*;
import java.util.*;

public class Example {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("test2.txt"));

		ArrayList<String> list = new ArrayList<String>();

		list = getWords(input);
		System.out.println(list);

	}

	public static ArrayList<String> getWords(Scanner input){

        ArrayList<String> words = new ArrayList<String>();

        while(input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);
        System.out.println(words);

        ArrayList<String> result = new ArrayList<String>();
        if(words.size()>0) {
            result.add(words.get(0));
            for(int i=1;i<words.size();i++) {
                if(!words.get(i).equals(words.get(i-1))) {
                    result.add(words.get(i));
                }
            }

    }
        return result;
        }
}