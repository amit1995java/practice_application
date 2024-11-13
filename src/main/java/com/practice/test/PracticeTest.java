package com.practice.test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class PracticeTest {
	//Implement a function to check if two strings are rotations of each other.
	public Boolean isRotation(String s1, String s2) {
		if(s1.length()!= s2.length())
			return false;
		String concatenated = s1+s1;
		return  concatenated.contains(s1);
	}
	
	// Write a function to count the occurrences of a specific character in a string.
	public Boolean anagram(String str1,String str2) {
		//first check length same or not 
		if(str1.length()!=str2.length()) 
			return false;
		
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] chararray1=str1.toCharArray();
		char[] chararray2=str2.toCharArray();
		
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		
		return Arrays.equals(chararray1, chararray2);
	}
	
	//Write a function to count the occurrences of a specific character in a string.
	public static int countOccurence(String str,char target) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) count++;
		}
		return count;
	}
	
	//Write a function to find all permutations of a string.
	

	 public static Character findFirstNonRepeatingCharacter(String str) {
	       // Step 1: Create a LinkedHashMap to store character counts
	       Map<Character, Integer> charCountMap = new LinkedHashMap<>();

	        // Step 2: Populate the map with character frequencies
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Step 3: Find the first character with a count of 1
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }

	        // Step 4: If no non-repeating character is found, return null
	        return null;
	    }
	       
	    
	

	

	public static void main(String[] args) {
		String word = "Blanket";
		String[] arr = word.split(" ");
		System.out.println(arr[0]);
		PracticeTest newobj=new PracticeTest();
		
		System.out.println( newobj.anagram("listen", "silent")+" Hello Java!");
		System.out.println(countOccurence("amitkumark",'k'));
	
		// String operation 
		System.out.println("hello".hashCode());
		System.out.println("12345".matches("\\d+")); // Output: true
		
		System.out.println(newobj.isRotation("abcd","bcda"));
		
		
		String str = "swiss";
	    Character result = findFirstNonRepeatingCharacter(str);
	    if (result != null) {
	    System.out.println("First non-repeating character: " + result);
	    } else {
	            System.out.println("No non-repeating character found.");
	        }


	}

}
