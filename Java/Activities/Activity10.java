package activities;

import java.util.HashSet;
import java.util.Set;


class Activity10 {
	public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>();
		
		numSet.add(100);
		numSet.add(72722);
		numSet.add(909099);
		numSet.add(2025);
		numSet.add(23322);
		numSet.add(1999);
		
		for(int num : numSet) {
			System.out.println(num);
		}
		System.out.println("Size of the set: " + numSet.size());
		
		
		numSet.remove(100);
		
		System.out.println("Size of the set: " + numSet.size());
		
		System.out.println(numSet);
		
		System.out.println("Search for 100? " + numSet.contains(100));



		
	}
}