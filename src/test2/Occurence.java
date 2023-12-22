package test2;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
		String c = "Pooja";
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = c.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], 1);
			} else {
				int num = map.get(charArray[i]);
				map.put(charArray[i], num + 1);
			}
		}

		System.out.println(map+"My map");
	}

}
