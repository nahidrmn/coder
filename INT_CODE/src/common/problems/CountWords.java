package common.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountWords {
	public static void main(String[] args) {
		String string = "This is is written by Nahid Rahman";
		String[] splitString = string.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < splitString.length - 1; i++) {
			if (map.containsKey(splitString[i])) {
				int count = map.get(splitString[i]);
				map.put(splitString[i], count + 1);
			} else {
				map.put(splitString[i], 1);
			}
		}
		Iterator<?> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> me = (Entry<String, Integer>) iterator.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}