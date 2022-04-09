import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> wordCountmap=new HashMap<String, Integer>();
        Scanner input = new Scanner(new File("test.txt"));

        while(input.hasNext()){
            String word = input.next().toLowerCase();
        }

        String word = null;
        if (!wordCountmap.containsKey(word)){
            wordCountmap.put(word,1);

        }else {
            int count =wordCountmap.get(word);
            wordCountmap.put(word,count+1);
        }
        System.out.println(wordCountmap);
    }
}
