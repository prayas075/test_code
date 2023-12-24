package test2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		String str1 = "Prayas Pikalmunde from remote";
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
