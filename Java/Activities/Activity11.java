package activities;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


class Activity11 {
	public static void main(String[] args) {
		Map<Integer, String> colours = new HashMap<>();
		
		colours.put(100, "Red");
		colours.put(101, "Blue");
		colours.put(102, "White");
		colours.put(103, "Green");
		colours.put(104, "Black");
		
		System.out.println(colours);
		for(Entry<Integer, String> item: colours.entrySet()) {
			System.out.println(item.getKey() + ": " + item.getValue());
		}
		for(int key : colours.keySet()) {
			System.out.println(key + ": " + colours.get(key));
		}
		
		colours.remove(103);
		System.out.println("Does green exist? " + colours.containsValue("Green"));
		
		System.out.println("Size of the map" + colours.size());


		
	}

}
