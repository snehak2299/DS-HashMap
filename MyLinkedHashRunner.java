package com.bridglab.hashmap;

public class MyLinkedHashRunner {
		public static void main(String[] args) {
			String paragraph = "Paranoids are not paranoid because they are paranoid "
								+ "but because they keep putting themselves "
								+ "deliberately into paranoid avoidable situations";
			
			MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
			String[] words = paragraph.toLowerCase().split(" ");
			for( String word : words) {
				Integer value = myLinkedHashMap.get(word);
				if (value == null) value = 1;
				else value ++;
				myLinkedHashMap.add(word, value);
			}
			System.out.println(myLinkedHashMap);
		} 
	

}
