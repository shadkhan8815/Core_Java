package in.co.rays.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollectoin {
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(4, "gggg");

		System.out.println(map);

		// map.clear();
		map.remove(1);
		System.out.println(map);

		// Retrieve and print values based on keys
		System.out.println(map.get(4));

		// Check if a key is present in the map
		System.out.println(map.containsKey(4));

		// Iterate over the keys and values in the map
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		for (int i = 1; i <= map.size(); i++) {

			System.out.println(map.get(i));

		}
	}

}
