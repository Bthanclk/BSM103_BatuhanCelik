import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> citys = new HashMap<String, Integer>();

		citys.put("�stanbul", 34);
		citys.put("Ankara", 06);
		citys.put("�zmir", 35);

		System.out.println(citys);
		System.out.println("�ndeksler - Keys " + citys.keySet());
		System.out.println(citys.values());

		Map<Integer, Set<String>> citys2 = new HashMap<Integer, Set<String>>();
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("�stanbul");
		citys2.get(34).add("Be�ikta�");

		System.out.println(citys2);
	}
}
