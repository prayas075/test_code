package test2;

import java.util.LinkedHashMap;
import java.util.Map;
//comment from prayas
public class Practice {
	public static void main(String[] args) {
<<<<<<< HEAD
		String str1 = "Prayas Pikalmunde";
		//from local
=======
		String str1 = "Prayas Pikalmunde from remote";
>>>>>>> 9a2ca6bcef8139800002aa916721682de700a76a
		String longString = null;
		Integer longLen = 0;
		char[] ch1 = str1.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < ch1.length; i++) {
			char c = ch1[i];
			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {

				i = map.get(c);
				map.clear();

			}
			if (map.size() > longLen) {
				longLen=	map.size();
				longString=map.keySet().toString();
			}
		}
		System.out.println(longString);

	}
}
